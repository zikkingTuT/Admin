package com.zky.eleadmin.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zky.eleadmin.domain.BookChapter;
import com.zky.eleadmin.domain.UserInfo;
import com.zky.eleadmin.service.BookChapterService;
import com.zky.eleadmin.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@RestController
public class UserController {


    @Resource
    private UserInfoService userInfoService;

    @Resource
    private BookChapterService bookChapterService;


    @GetMapping("/export")
    public void getUserInfo(HttpServletResponse response) throws IOException {
        System.out.print("222");
        // 设置响应头
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment;filename=export_data.xlsx");

        // 初始化 EasyExcel 写入器
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream(), BookChapter.class)
                .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                .build();
        // 分页参数配置
        int pageSize = 2000; // 每页2000条（根据内存调整）
        int currentPage = 1;
        int totalProcessed = 0;
        boolean hasNext = true;
        // 分页循环写入
        while (hasNext) {
            Page<BookChapter> page = new Page<>(currentPage, pageSize);
            Page<BookChapter> userPage = bookChapterService.getBaseMapper().selectPage(page, null); // 根据业务添加查询条件

            // 转换DTO并写入Excel
            List<BookChapter> dataList = userPage.getRecords();
            excelWriter.write(dataList, EasyExcel.writerSheet("Sheet1").build());
            // 更新循环条件
            totalProcessed += dataList.size();
            currentPage++;
            hasNext = userPage.getRecords().size() == pageSize;
            // 内存优化：清除当前批次对象引用
            dataList.clear();
            userPage.getRecords().clear();
        }
        // 关闭资源
        excelWriter.finish();
    }

    @PostMapping("/update")
    public UserInfo update(@RequestBody UserInfo userInfo) {

        System.out.println("格式化用户信息" + JSON.toJSONString(userInfo));
        System.out.println("格式化用户信息" + userInfo);
        LambdaUpdateWrapper<UserInfo> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.set(UserInfo::getId, userInfo.getId())
                .set(UserInfo::getStartTime, userInfo.getStartTime())
                .set(UserInfo::getUserPhoto, userInfo.getUserPhoto());
        userInfoService.update(updateWrapper);
        if (Objects.isNull(userInfo.getStartTime())) {
//            Optional<LocalDateTime> currentTime  = Optional.empty();
            userInfo.setStartTime(null);
        }
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
//        userInfoService.updateById(userInfo);
        queryWrapper.eq("id", userInfo.getId());
        return userInfoService.getOne(queryWrapper);

    }
}

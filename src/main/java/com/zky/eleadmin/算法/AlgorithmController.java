package com.zky.eleadmin.算法;

public class AlgorithmController {
    /**
     * 二分查找 有两种解法 左闭右闭[] 左闭右开[) 当前算法为左闭右闭方法
     * @param nums 数组
     * @param target 目标值
     * @return 返回结果
     */
    public int Search(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        //首先排除在范围外 在左右边界外
        if(target< left ||target> right){
            return -1;
        }
        //循环判断 无限去逼近接近值
        while (left <= right){
            int mid = (left + right) / 2;//可能会造成数据溢出
            int midval = left + ((right - left)>> 1);//取中间值防止数据溢出
            if (nums[midval] == target){
                return midval;
            }else if (nums[midval] < target){ //target 位于右侧 左边界右移 1
                left = midval + 1;
            }else {
                right = midval - 1; // 否则 位于左侧 有边界左移 1
            }
        }
        return -1;
    }
}

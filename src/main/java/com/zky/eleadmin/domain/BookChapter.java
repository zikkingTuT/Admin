package com.zky.eleadmin.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 小说章节
 * @TableName book_chapter
 */
@TableName(value ="book_chapter")
@Data
public class BookChapter {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    @ExcelProperty(value = "id", index = 1)
    private Long id;

    /**
     * 小说ID
     */
    @ExcelProperty(value = "小说ID", index = 2)
    private Long bookId;

    /**
     * 章节号
     */
    @ExcelProperty(value = "章节号", index = 3)
    private Integer chapterNum;

    /**
     * 章节名
     */
    @ExcelProperty(value = "章节名", index = 4)
    private String chapterName;

    /**
     * 章节字数
     */
    @ExcelProperty(value = "章节字数", index = 5)
    private Integer wordCount;

    /**
     * 是否收费;1-收费 0-免费
     */
    @ExcelProperty(value = "是否收费", index = 6)
    private Integer isVip;

    /**
     * 
     */
    @ExcelProperty(value = "创建时间", index = 7)
    private Date createTime;

    /**
     * 
     */
    @ExcelProperty(value = "更新时间", index = 8)
    private Date updateTime;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BookChapter other = (BookChapter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getChapterNum() == null ? other.getChapterNum() == null : this.getChapterNum().equals(other.getChapterNum()))
            && (this.getChapterName() == null ? other.getChapterName() == null : this.getChapterName().equals(other.getChapterName()))
            && (this.getWordCount() == null ? other.getWordCount() == null : this.getWordCount().equals(other.getWordCount()))
            && (this.getIsVip() == null ? other.getIsVip() == null : this.getIsVip().equals(other.getIsVip()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getChapterNum() == null) ? 0 : getChapterNum().hashCode());
        result = prime * result + ((getChapterName() == null) ? 0 : getChapterName().hashCode());
        result = prime * result + ((getWordCount() == null) ? 0 : getWordCount().hashCode());
        result = prime * result + ((getIsVip() == null) ? 0 : getIsVip().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookId=").append(bookId);
        sb.append(", chapterNum=").append(chapterNum);
        sb.append(", chapterName=").append(chapterName);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", isVip=").append(isVip);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}
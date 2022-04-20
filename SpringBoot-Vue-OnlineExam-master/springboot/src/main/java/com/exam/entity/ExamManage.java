package com.exam.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExamManage {
    private Integer examCode;//考试编码

    private String description;//考试说明

    private String source;//来源

    private Integer paperId;//页码

    private String examDate;//考试时间

    private Integer totalTime;//总时间

    private String grade;//年级

    private String term;//学期

    private String major;//专业

    private String institute;//学院

    private Integer totalScore;//总分

    private String type;//类型

    private String tips;//提示
}
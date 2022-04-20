package com.exam.entity;

import lombok.Data;

//填空题实体类
@Data
public class FillQuestion {
    private Integer questionId;//题号

    private String subject;//学科

    private String question;//问题

    private String answer;//答案

    private Integer score;//分数

    private String level;//等级

    private String section;//部分

    private String analysis; //题目解析
}

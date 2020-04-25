package com.smj.service.entity;

import lombok.Data;

@Data
public class UserVo extends User{

    private String provinceName;

    private String cityName;
}

package com.example.cloudconsumer.vo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserVO {
    private Integer userId;
    @JsonAlias("userName")//映射别名
    private String Name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userBirth;
}

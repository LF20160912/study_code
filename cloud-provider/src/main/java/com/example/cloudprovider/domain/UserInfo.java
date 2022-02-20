package com.example.cloudprovider.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class UserInfo {
    private Integer id;
    private String name;
    private int age;
    private String address;
}

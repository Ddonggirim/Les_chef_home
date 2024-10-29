package com.example.LesChef.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddCustomerRequest {
    private String id;
    private String password;
    private String name;
    private String nickname;
    private String tel;
    private String customerImg;
}

package com.example.LesChef.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class RegistStepForm {
    private List<String> stepImgs;
    private List<String> stepWays;
}

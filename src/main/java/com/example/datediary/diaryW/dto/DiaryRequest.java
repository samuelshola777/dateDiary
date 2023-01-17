package com.example.datediary.diaryW.dto;

import lombok.Data;

@Data

public class DiaryRequest {

    private String date;
    private String month;
    private String year;
    private String title;
    private String body;
    private String diaryDate;
    private String identifier;

}

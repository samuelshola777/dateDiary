package com.example.datediary.diaryW.data.model;

import com.example.datediary.Date.data.model.DiaryDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Diary {
    private DiaryDate date;
    private String identifier;
    private String title;
    private String body;
}

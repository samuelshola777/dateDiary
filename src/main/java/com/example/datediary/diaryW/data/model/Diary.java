package com.example.datediary.diaryW.data.model;

import com.example.datediary.diaryW.diaryExeption.DiaryDateExeption;
import com.example.datediary.diaryW.diaryExeption.DiaryMonthExeption;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document
public class Diary {
    @NonNull
    private String date;
    @NonNull
    private String month;
    @NonNull
    private String year;
    private String title;
    private String body;
    private String diaryDate;
    private String identifier;
    private Date Ddate;


    public String setDiaryDate(String date, String month, String year) {
        String zero = "0";String twoNZero = "20";
        this.date = date;
        this.month = month;
        this.year = year;
        if (date.length() < 2){
            date = zero + date;
        } if (month.length() < 2){
            month = zero + month;
        }
        if (year.length() < 4 && year.length() == 2){
            year = twoNZero + year;
        }
            this.diaryDate = date + month + year;
        return diaryDate;
    }

    public void setDate(String date) throws DiaryDateExeption {

        if ( Integer.parseInt(date) < 0 || Integer.parseInt(date) > 31){
            throw new DiaryDateExeption("you have entered an invalid date");
        }
        this.date = date;
    }

    public void setMonth(String month) throws DiaryMonthExeption {
        if (Integer.parseInt(month) < 0 || Integer.parseInt(month) > 12){
            throw new DiaryMonthExeption("you have entered an invalid month ");
        }
        this.month = month;
    }

    public void setYear(String year) {
        if (year.length() < 2 || year.length() > 4 ){
        }
        this.year = year;
    }
}

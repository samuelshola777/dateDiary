package com.example.datediary.diaryW.service;

import com.example.datediary.diaryW.data.model.Diary;
import com.example.datediary.diaryW.diaryExeption.DiaryExeption;
import com.example.datediary.diaryW.dto.DiaryRequest;
import com.example.datediary.diaryW.dto.DiaryResponse;
import org.springframework.stereotype.Service;

import java.util.Date;


public interface DiaryServiceInterface {


    DiaryResponse writeDiary(DiaryRequest diaryRequest2) throws DiaryExeption;

    int count();

    Diary findDiaryPageByIdentifier(String horse);

    DiaryResponse deleteAllDiaryWringing();
}

package com.example.datediary.diaryW.controller;

import com.example.datediary.diaryW.data.model.Diary;
import com.example.datediary.diaryW.diaryExeption.DiaryExeption;
import com.example.datediary.diaryW.dto.DiaryRequest;
import com.example.datediary.diaryW.dto.DiaryResponse;
import com.example.datediary.diaryW.service.DiaryServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiaryController {
    @Autowired
    DiaryServiceInterface diaryService;

    public DiaryResponse writeOnDiaryPage(DiaryRequest diaryRequest) throws DiaryExeption {
        diaryService.writeDiary(diaryRequest);
        return new DiaryResponse("diary page created successfully");
    }

    public DiaryResponse updateDiaryBody(String identifier , String updateBody){
        diaryService.updateDiaryBody(identifier, updateBody);
        return new DiaryResponse("Diary Body Update Successful");
    }

    public DiaryResponse updateDiaryTitle(String identifier, String updateTile){
        diaryService.updateTitle(identifier, updateTile);
        return new DiaryResponse("Diary Title Updated successfully");
    }

    public Diary viewDiaryPage(String identifier){
       return diaryService.findDiaryPageByIdentifier(identifier);
    }

    public DiaryResponse deleteAllDiaryPage(){
        diaryService.deleteAllDiaryWringing();
        return new DiaryResponse("all pages deleted successfully");
    }
}

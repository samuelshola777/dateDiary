package com.example.datediary.diaryW.data.repository;

import com.example.datediary.diaryW.data.model.Diary;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface DiaryRepository extends MongoRepository <Diary, String> {

    Diary findDiaryPageByIdentifier(String identifier);
}

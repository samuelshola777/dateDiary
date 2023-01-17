package com.example.datediary.diaryW.service;

import com.example.datediary.diaryW.dto.DiaryRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class DiaryServiceInterfaceTest {
@Autowired
    DiaryServiceInterface diaryService;
DiaryRequest diaryRequest1;
DiaryRequest diaryRequest2;
DiaryRequest diaryRequest3;
DiaryRequest diaryRequest4;
    @BeforeEach
    @Test
    void setUp() {
        diaryRequest1 = new DiaryRequest();
        diaryRequest1.setDate("");
        diaryRequest2 = new DiaryRequest();
        diaryRequest3 = new DiaryRequest();
        diaryRequest4 = new DiaryRequest();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeCanWriteInDiary(){

    }



}
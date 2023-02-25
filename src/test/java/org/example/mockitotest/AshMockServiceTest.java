package org.example.mockitotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AshMockServiceTest {


    @Spy
    AshMockRepository repository;

    @InjectMocks
    AshMockService service;

    @Mock
    AshMockRepository mockRepository;

    @Test
    void test1() {

        Mockito.when(repository.getData("b")).thenReturn("no-answer");
        String a = repository.getData("a");


        Assertions.assertEquals(repository.getData("b"), "no-answer");
        Assertions.assertEquals(repository.getData("a"), "real");

//        spy는
        String a1 = mockRepository.getData("a");
        System.out.println(a1);


    }









}
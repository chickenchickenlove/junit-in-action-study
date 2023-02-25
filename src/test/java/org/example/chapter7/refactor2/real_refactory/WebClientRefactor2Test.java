package org.example.chapter7.refactor2.real_refactory;

import org.example.chapter7.refactor2.TestableWebClientRefactor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class WebClientRefactor2Test {

    @Test
    void test1() {
        // Mock 객체 생성
        MockURLConnectionFactory mockURLConnectionFactory = new MockURLConnectionFactory();
        mockURLConnectionFactory.setData(new ByteArrayInputStream("It works".getBytes()));

        // 테스트 대상 생성
        WebClientRefactor2 webClient = new WebClientRefactor2();

        // 테스트 실행
        String content = webClient.getContent(mockURLConnectionFactory);

        // 테스트 검증
        assertEquals("It works".getBytes(), content);
    }
}
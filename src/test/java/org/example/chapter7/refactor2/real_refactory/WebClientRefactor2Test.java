package org.example.chapter7.refactor2.real_refactory;

import org.example.chapter7.refactor2.TestableWebClientRefactor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WebClientRefactor2Test {


    /**
     * @Mock : Mock 객체를 생성한다.
     * @InjectMocks : Mock 객체를 넣어준다.
     *
     */

    @Mock
    ConnectionFactory connectionFactory;

    @Mock
    HttpURLConnectionFactory httpURLConnectionFactory;


    @Spy
    URL url;


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

    @Test
    void test1WithMock() throws Exception {

        // Mock 객체 생성
        when(connectionFactory.getData()).thenReturn(new ByteArrayInputStream("It works".getBytes()));

        // 테스트 대상 생성
        WebClientRefactor2 webClient = new WebClientRefactor2();

        // 테스트 실행
        String content = webClient.getContent(connectionFactory);

        // 테스트 검증
        assertEquals("It works", content);
    }

}
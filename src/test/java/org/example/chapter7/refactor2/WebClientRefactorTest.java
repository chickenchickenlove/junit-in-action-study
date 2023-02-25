package org.example.chapter7.refactor2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;


/**
 * 아래는 WebClient를 테스트 하기 위해서 확장 가능한 테스트 케이스를 만들어서 테스트한다.
 * 그렇지만 이 경우, 테스트 대상을 직접 테스트 한 것이 아니다.
 */
class WebClientRefactorTest {

    @Test
    void test1() throws IOException {
        /*
        // Mock 객체 생성
        MockHttpConnection mockHttpConnection = new MockHttpConnection();
        mockHttpConnection.setExpectedInputStream(
                new ByteArrayInputStream("It works".getBytes()));

        MockUrl mockUrl = new MockUrl("http://localhost");
        mockUrl.setupOpenConnection(mockHttpConnection);

        // 테스트 대상 생성
        WebClient webClient = new WebClient();

        // 테스트 실행
        String result = webClient.getContent(mockUrl);

        // 결과 확인
        Assertions.assertEquals("It works", result);
         */

        /**
         * Final 클래스는 Mock을 생성할 수 없다.
         * 따라서 아래 클래스는 실패한다.
         */
        URL mockURL = Mockito.mock(URL.class);
        HttpURLConnection mockConnection = Mockito.mock(HttpURLConnection.class);
        Mockito.when(mockURL.openConnection()).thenReturn(mockConnection);
        Mockito.when(mockConnection.getInputStream()).thenReturn(new ByteArrayInputStream("It works".getBytes()));

        WebClient webClient = new WebClient();
        String content = webClient.getContent(mockURL);

        Assertions.assertEquals("It works", content);


    }
}
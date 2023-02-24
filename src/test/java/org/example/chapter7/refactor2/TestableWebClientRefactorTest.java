package org.example.chapter7.refactor2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;


/**
 * 아래는 WebClient를 테스트 하기 위해서 확장 가능한 테스트 케이스를 만들어서 테스트한다.
 * 그렇지만 이 경우, 테스트 대상을 직접 테스트 한 것이 아니다.
 */
class TestableWebClientRefactorTest {

    @Test
    void test1() {
        MockHttpConnection mockHttpConnection = new MockHttpConnection();
        mockHttpConnection.setExpectedInputStream(
                new ByteArrayInputStream("It works".getBytes()));
        TestableWebClientRefactor client = new TestableWebClientRefactor();
        client.setConnection(mockHttpConnection);
        String result = client.getContent(new URL("http://localhost"));
        Assertions.assertEquals("It works", result);
    }

}
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
        MockURLConnectionFactory mockURLConnectionFactory = new MockURLConnectionFactory();
        mockURLConnectionFactory.setData(new ByteArrayInputStream("It works".getBytes()));
        WebClientRefactor2 webClient = new WebClientRefactor2();
        String content = webClient.getContent(mockURLConnectionFactory);
        assertEquals("It works".getBytes(), content);
    }



}
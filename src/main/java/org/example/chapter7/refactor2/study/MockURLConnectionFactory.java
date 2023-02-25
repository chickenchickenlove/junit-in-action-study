package org.example.chapter7.refactor2.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class MockURLConnectionFactory implements UrlConnectionFactory{

    private InputStream inputStream;

    public MockURLConnectionFactory(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return this.inputStream;
    }
}

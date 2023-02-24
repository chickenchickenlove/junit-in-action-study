package org.example.chapter7.refactor2.real_refactory;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MockURLConnectionFactory implements ConnectionFactory{

    private InputStream data;

    public void setData(InputStream data) {
        this.data = data;
    }

    @Override
    public InputStream getData() throws Exception {
        return null;
    }
}

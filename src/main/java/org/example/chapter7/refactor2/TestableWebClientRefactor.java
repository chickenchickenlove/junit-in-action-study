package org.example.chapter7.refactor2;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestableWebClientRefactor extends WebClientRefactor{

    // 내가 원하는 커넥션을 주입할 수 있도록 한다.
    private HttpURLConnection connection;

    public void setConnection(HttpURLConnection connection) {
        this.connection = connection;
    }

    protected HttpURLConnection createHttpURLConnection(URL url) throws IOException {
        return this.connection;
    }
}

package org.example.chapter7.refactor2.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionFactory implements UrlConnectionFactory{

    private final URL url;

    public HttpURLConnectionFactory(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        return urlConnection.getInputStream();
    }
}

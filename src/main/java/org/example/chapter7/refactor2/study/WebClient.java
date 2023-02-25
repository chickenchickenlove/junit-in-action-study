package org.example.chapter7.refactor2.study;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {

    public WebClient() {
    }

    public String getContent(UrlConnectionFactory factory) {
        StringBuffer content = new StringBuffer();
        try{
            InputStream is = factory.getInputStream();
            int count ;
            while (-1 != (count = is.read())) {
                content.append(new String(Character.toChars(count)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }
}

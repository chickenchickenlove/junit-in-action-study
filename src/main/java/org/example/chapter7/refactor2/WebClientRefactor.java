package org.example.chapter7.refactor2;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClientRefactor {
    public String getContent(URL url) {
        StringBuffer content = new StringBuffer();
        try{
            // createHttpURLConnection() 메서드 도입
            HttpURLConnection connection = createHttpURLConnection(url);
            connection.setDoInput(true);
            InputStream is = connection.getInputStream();
            int count ;
            while (-1 != (count = is.read())) {
                content.append(new String(Character.toChars(count)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }

    protected HttpURLConnection createHttpURLConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }
}

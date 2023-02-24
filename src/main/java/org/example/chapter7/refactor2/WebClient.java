package org.example.chapter7.refactor2;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebClient {
    public String getContent(URL url) {
        StringBuffer content = new StringBuffer();
        try{
            // 이거 있어서 안됨.
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
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


}

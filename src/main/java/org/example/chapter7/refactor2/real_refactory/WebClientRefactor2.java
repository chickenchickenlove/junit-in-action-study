package org.example.chapter7.refactor2.real_refactory;

import java.io.InputStream;

public class WebClientRefactor2 {
    public String getContent(ConnectionFactory connectionFactory) {
        StringBuffer content = new StringBuffer();
        try{
            InputStream is = connectionFactory.getData();
            int count ;
            while (-1 != (count = is.read())) {
                content.append(new String(Character.toChars(count)));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }
}

package org.example.chapter7.refactor2.study;

import java.io.IOException;
import java.io.InputStream;

public interface UrlConnectionFactory {
    InputStream getInputStream() throws IOException;

}

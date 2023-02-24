package org.example.chapter7.refactor2.real_refactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public interface ConnectionFactory {
    InputStream getData() throws Exception;
}

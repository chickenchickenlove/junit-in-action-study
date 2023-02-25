package org.example.chapter7.troi;

import java.io.IOException;
import java.io.InputStream;

public class MockInputStream extends InputStream {

    private int closeCount = 0;

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {
        closeCount++;
        super.close();
    }

    public void verify() {
        if (closeCount != 1) {
            throw new AssertionError("close() should have been called once and once only");
        }
    }
}

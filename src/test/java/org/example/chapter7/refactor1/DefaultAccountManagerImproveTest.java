package org.example.chapter7.refactor1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultAccountManagerImproveTest {

    @Test
    void test1() {
        MockLog logger = new MockLog();
        MockConfiguration mockConfiguration = new MockConfiguration();
        mockConfiguration.put("sql", "SELECT * FROM ...");
        DefaultAccountManagerImprove defaultAccountManagerImprove = new DefaultAccountManagerImprove(logger, mockConfiguration);
        // ...
    }

}
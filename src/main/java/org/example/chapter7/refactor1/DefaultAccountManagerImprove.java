package org.example.chapter7.refactor1;

import org.example.chapter7.Account;
import org.example.chapter7.AccountManager;

import java.lang.module.Configuration;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultAccountManagerImprove implements AccountManager {

    private Logger logger;
    private Map<String, String> config;


    public DefaultAccountManagerImprove() {
        this(Logger.getLogger(DefaultAccountManagerImprove.class.getName()),
                new HashMap<>());
    }

    public DefaultAccountManagerImprove(Logger logger, Map<String, String> config) {
        this.logger = logger;
        this.config = config;
    }


    @Override
    public Account findAccountForUser(String userId) {
        logger.log(Level.WARNING, "Getting account for user [ " + userId + " ]");
        String sql = config.get("sql");
        // JDBC를 이용해 사용자 계정을 읽어오는 코드 로직
        return null;
    }

    @Override
    public void updateAccount(Account account) {
    }
}

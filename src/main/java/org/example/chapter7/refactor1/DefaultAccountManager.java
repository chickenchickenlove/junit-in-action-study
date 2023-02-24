package org.example.chapter7.refactor1;

import org.example.chapter7.Account;
import org.example.chapter7.AccountManager;

import java.util.HashMap;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultAccountManager implements AccountManager {

    private static final Logger logger = Logger.getLogger(AccountManager.class.getName());

    @Override
    public Account findAccountForUser(String userId) {
        logger.log(Level.WARNING, "Getting account for user [ " + userId + " ]");
        ResourceBundle config = PropertyResourceBundle.getBundle("technical");
        String sql = config.getString("FIND_ACCOUNT_FOR_USER");
        // JDBC를 이용해 사용자 계정을 읽어오는 코드 로직
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }
}

package org.example.chapter7;

public interface AccountManager {
    Account findAccountForUser(String userId);

    void updateAccount(Account account);
}

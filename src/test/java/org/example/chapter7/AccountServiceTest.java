package org.example.chapter7;

import net.bytebuddy.ByteBuddy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.objenesis.ObjenesisBase;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    AccountManager mockManager;

    @Test
    void testTransferOk() {

        MockAccountManager mockAccountManager = new MockAccountManager();

        Account senderAccount = new Account("1", 200);
        Account beneficiaryAccount = new Account("2", 100);

        mockAccountManager.addAccount("1", senderAccount);
        mockAccountManager.addAccount("2", beneficiaryAccount);

        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockAccountManager);
        accountService.transfer("1", "2", 50);

        assertEquals(150, senderAccount.getBalance());
        assertEquals(150, beneficiaryAccount.getBalance());
    }

    @Test
    void testTransferOkWithMock() {

        // Mock
        when(mockManager.findAccountForUser("1")).thenReturn(new Account("1", 200));
        when(mockManager.findAccountForUser("2")).thenReturn(new Account("2", 100));

        // given
        AccountService accountService = new AccountService();
        accountService.setAccountManager(mockManager);

        // when
        accountService.transfer("1", "2", 50);

        // then
        assertEquals(150, mockManager.findAccountForUser("1").getBalance());
        assertEquals(150, mockManager.findAccountForUser("2").getBalance());
    }

}
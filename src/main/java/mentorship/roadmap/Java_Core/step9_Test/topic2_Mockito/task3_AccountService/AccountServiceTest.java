package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.Account;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task3_AccountService.forTest.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class AccountServiceTest {
    private AccountRepository accountRepository;
    private AccountService accountService;

    @BeforeEach
    void setUp() {
        accountRepository = mock(AccountRepository.class);
        accountService = new AccountService(accountRepository);
    }

    @Test
    void withdrawSuccesful() {
        Account account = new Account("acc1", 10.0);
        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        boolean result = accountService.withdraw(account.getAccountId(), 5);
        assertTrue(result);
        assertTrue(account.getBalance() == 5.0); //проверка что баланс уменьшился

        verify(accountRepository).findAccountById(account.getAccountId());
        verify(accountRepository).updateAccount(account);
    }

    @Test
    void withdrawFailureNonSufficientFunds() {
        Account account = new Account("acc2", 1.0);
        when(accountRepository.findAccountById(account.getAccountId())).thenReturn(account);

        boolean result = accountService.withdraw(account.getAccountId(), 10);
        assertFalse(result);

        verify(accountRepository).findAccountById(account.getAccountId());
        verify(accountRepository, never()).updateAccount(any()); //убедиться, что не было вызова updateAccount
    }

    @Test
    void withdrawFailureAccountNotFound() {
        Account account = new Account("acc3", 20.0);
        when(accountRepository.findAccountById("notfound")).thenReturn(null);

        boolean result = accountService.withdraw("notfound", 10);
        assertFalse(result);

        verify(accountRepository).findAccountById("notfound");
        verify(accountRepository, never()).updateAccount(any()); //убедиться, что не было вызова updateAccount
    }
}

package pl.pjatk.s26407Bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountServiceMockTest {

    @Mock
    private AccountStorage accountStorage;

    @InjectMocks
    private AccountService accountService;

    @Test
    void shouldMockValues() {

        when(accountStorage.getAccountList()).thenReturn(List.of(new Account(4, new User("Ala"), 1000)));

        assertThat(accountStorage.getAccountList()).isNotEmpty();
    }

    @Test
    void shouldNotDoneTransaction() {


        when(accountService.transferOut(4, 1000));

        assertThat(account).isNull();

    }


}

package pl.pjatk.s26407Bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class AccountServiceIntegrationTest {

    @MockBean
    private AccountStorage accountStorage;

    @Autowired
    private AccountService accountService;

    @Test
    void shouldNotDoneTransaction() {

    }

}

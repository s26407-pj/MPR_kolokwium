package pl.pjatk.s26407Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S26407BankApplication {

	private final AccountService accountService;

	public S26407BankApplication(AccountService accountService) {
		this.accountService = accountService;

		accountService.newAccount(3, new User("Michał"), 3000);
		accountService.showAccount(1);
		accountService.transferIn(1, 3000);
		accountService.transferOut(1, 1000);
	}


	public static void main(String[] args) {
		SpringApplication.run(S26407BankApplication.class, args);
	}

}

package com.epam.engx.cleancode.functions.task1;

import com.epam.engx.cleancode.functions.task1.thirdpartyjar.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static com.epam.engx.cleancode.functions.task1.thirdpartyjar.CheckStatus.OK;

public class RegisterAccountAction {

	private PasswordChecker passwordChecker;
	private AccountManager accountManager;
	private static final int MINIMUM_ACCOUNT_LENGTH = 5; 
	private static final int MINIMUM_PASSWORD_LENGTH = 8; 
	
	public void register(Account account) {
		String password = account.getPassword();
		validateName(account.getName());
		validateShortPassword(password);
		validateWrongPassword(password);
		account.setCreatedDate(new Date());
		List<Address> addresses = getAddress(account);
		account.setAddresses(addresses);
		accountManager.createNewAccount(account);
	}

	private void validateName(String accountName) {
		if (accountName.length() <= MINIMUM_ACCOUNT_LENGTH) {
			throw new WrongAccountNameException();
		}
	}

	private void validateShortPassword(String password) {
		if (password.length() <= MINIMUM_PASSWORD_LENGTH) {
			throw new TooShortPasswordException();
		}
	}

	private void validateWrongPassword(String password) {
		if (passwordChecker.validate(password) != OK) {
			throw new WrongPasswordException();
		}
	}

	private List<Address> getAddress(Account account) {
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(account.getHomeAddress());
		addresses.add(account.getWorkAddress());
		addresses.add(account.getAdditionalAddress());
		return addresses;
	}

	public void setAccountManager(AccountManager accountManager) {
		this.accountManager = accountManager;
	}

	public void setPasswordChecker(PasswordChecker passwordChecker) {
		this.passwordChecker = passwordChecker;
	}

}

package java0307;

public class AccountDto {
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;

	public AccountDto() {
		// TODO Auto-generated constructor stub
	}

	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		this.accountNumber = accountNumber;
		this.accountSeq = accountSeq;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getAccountSeq() {
		return accountSeq;
	}

	public int getBalance() {
		return balance;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", userSeq=" + userSeq + "]";
	}
}

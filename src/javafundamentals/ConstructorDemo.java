package javafundamentals;

class Account {
	
	private long accountNumber;
	private long customerid;
	private String ifscCode;
	private String branchCode;
	
	//default constructor
	public Account() {
		accountNumber = 99999999;
		customerid = 99999999;
		ifscCode = "";
		branchCode = "";
	}
	
	//parameterise constructor
	public Account(long accountNumber, long customerid, String ifscCode, String branchCode) {
		this.accountNumber = accountNumber;
		this.customerid = customerid;
		this.ifscCode = ifscCode;
		this.branchCode = branchCode;
	}
	
	public void showDetails() {
		System.out.println("accountNumber = "+accountNumber);
		System.out.println("customerid = "+customerid);
		System.out.println("ifscCode = "+ifscCode);
		System.out.println("branchCode = "+branchCode);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Account account = new Account(1234567, 222222, "BOI0091834", "BOI92374927");
		account.showDetails();
		
		Account account2 = new Account();
		account2.setAccountNumber(3247238947l);
		account2.setCustomerid(39472);
		account2.setIfscCode("SBIN00000");
		account2.setBranchCode("SBIN00000");
		
		System.out.println("--------------------------------");
		account2.showDetails();
		
		System.out.println("Account No ="+account.getAccountNumber());
		
	}
}

package in.mindcraft.pojos;

public class Customer {
    private long customerId;
    private String username;
    private String password;
    private double walletBalance;
    
    public Customer() {
    	
    }
    
    
	public Customer(long customerId, String username, String password, double walletBalance) {
		//super();
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.walletBalance = walletBalance;
	}
	
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", username=" + username + ", password=" + password
				+ ", walletBalance=" + walletBalance + "]";
	}

    
}

package in.mindcraft.pojos;

public class Wallet_trans {


    private long transactionId;
    private long customerId;
    private double amount;
    private String transactionType; // "debit" or "credit"
    
    public Wallet_trans() {
    	
    }
    
	public Wallet_trans(long transactionId, long customerId, double amount, String transactionType) {
		//super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.amount = amount;
		this.transactionType = transactionType;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	@Override
	public String toString() {
		return "wallet_trans [transactionId=" + transactionId + ", customerId=" + customerId + ", amount=" + amount
				+ ", transactionType=" + transactionType + "]";
	}

    
}

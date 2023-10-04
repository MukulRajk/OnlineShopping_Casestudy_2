package in.mindcraft.pojos;

public class Cartitem {


    private long cartItemId;
    private String product;
    private int quantity;
    
    
    public Cartitem() {
	
	}
    
	public Cartitem(long cartItemId, String product, int quantity) {
		//super();
		this.cartItemId = cartItemId;
		this.product = product;
		this.quantity = quantity;
	}
	public long getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "cartitem [cartItemId=" + cartItemId + ", product=" + product + ", quantity=" + quantity + "]";
	}

    
    
}

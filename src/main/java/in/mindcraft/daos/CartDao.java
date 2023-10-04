package in.mindcraft.daos;

import java.util.List;

import in.mindcraft.pojos.Cartitem;
import in.mindcraft.pojos.Customer;

public interface CartDao {
    void addCartItem(Cartitem cartItem);
    void updateCartItem(Cartitem cartItem);
    void deleteCartItem(Cartitem cartItem);
    List<Cartitem> getCartItemsByCustomer(Customer customer);
    void clearCart(Customer customer);
	Object getCartItems();
}

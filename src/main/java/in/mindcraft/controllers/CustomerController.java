package in.mindcraft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.mindcraft.daos.CartDao;
import in.mindcraft.daos.ProductDao;
import in.mindcraft.daos.WalletDao;
import in.mindcraft.exceptions.ProductNotFoundException;
import in.mindcraft.pojos.Cartitem;
import in.mindcraft.pojos.Product;
import in.mindcraft.pojos.Wallet_trans;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ProductDao productDAO;

    @Autowired
    private CartDao cartDAO;

    @Autowired
    private WalletDao walletDAO;

    @GetMapping("/productList")
    public String productList(Model model) {
        model.addAttribute("products", productDAO.getAllProducts());
        return "productList"; // Return the JSP view for listing products
    }

    @GetMapping("/addToCart/{productId}")
    public String addToCart(@PathVariable long productId) {
        Product product = productDAO.getproductById(productId);
        cartDAO.addCartItem(new Cartitem());
        return "redirect:/customer/cart";
    }

    @GetMapping("/cart")
    public String viewCart(Model model) {
        model.addAttribute("cartItems", cartDAO.getCartItems());
        return "cart"; // Return the JSP view for the cart
    }

    @GetMapping("/payBill")
    public String payBill() {
        // Calculate bill, update wallet, add wallet transaction, clear cart, etc.
        return "redirect:/customer/cart";
    }

    @GetMapping("/addBalance")
    public String addBalanceForm(Model model) {
        model.addAttribute("transaction", new Wallet_trans());
        return "addBalanceForm"; // Return the JSP view for adding balance
    }

    @PostMapping("/addBalance")
    public String addBalance(@ModelAttribute("transaction") Wallet_trans transaction) {
        walletDAO.addTransaction(transaction);
        return "redirect:/customer/cart";
    }

    @Autowired
    private ProductDao productDAO1;

    @GetMapping("/addToCart/{productId}")
    public String addToCart1(@PathVariable long productId) {
        Product product = productDAO.getproductById(productId);
        if (product == null) {
            throw new ProductNotFoundException("Product with ID " + productId + " not found.");
        }
        // Add the product to the cart
        return "redirect:/customer/cart";
    }

    // Other controller methods

}
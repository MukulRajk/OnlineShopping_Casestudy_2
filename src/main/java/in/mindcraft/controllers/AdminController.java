package in.mindcraft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.mindcraft.*;
import in.mindcraft.daos.CustomerDao;
import in.mindcraft.daos.ProductDao;
import in.mindcraft.pojos.Customer;
import in.mindcraft.pojos.Product;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductDao productDAO;

    @Autowired
    private CustomerDao customerDAO;

    @GetMapping("/addProduct")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProductForm"; // Return the JSP view for adding products
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") Product product) {
        productDAO.addProduct(product);
        return "redirect:/admin/productList"; // Redirect to product list after adding
    }

    @GetMapping("/productList")
    public String productList(Model model) {
        model.addAttribute("products", productDAO.getAllProducts());
        return "productList"; // Return the JSP view for listing products
    }

    @GetMapping("/addCustomer")
    public String addCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addCustomerForm"; // Return the JSP view for adding customers
    }

    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute("customer") Customer customer) {
        customerDAO.addCustomer1(customer);
        return "redirect:/admin/customerList"; // Redirect to customer list after adding
    }

    @GetMapping("/customerList")
    public String customerList(Model model) {
        model.addAttribute("customers", customerDAO.getAllCustomers());
        return "customerList"; // Return the JSP view for listing customers
    }

    // Additional methods for updating and deleting products/customers as needed
}

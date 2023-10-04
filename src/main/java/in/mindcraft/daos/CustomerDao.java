package in.mindcraft.daos;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.mindcraft.*;
import in.mindcraft.pojos.Customer;



public interface CustomerDao {
    Customer getCustomerByUsername(String username);
    void addCustomer1(Customer customer);
    void updateCustomer1(Customer customer);
    void deleteCustomer1(Customer customer);
    




@Repository
public class CustomerDAOImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Customer getCustomerByUsername(String username) {
		return null;
        // Implement the query to fetch a customer by username
    }

    @Override
    public void addCustomer1(Customer customer) {
        sessionFactory.getCurrentSession().save(customer);
    }

    @Override
    public void updateCustomer1(Customer customer) {
        sessionFactory.getCurrentSession().update(customer);
    }

    @Override
    public void deleteCustomer1(Customer customer) {
        sessionFactory.getCurrentSession().delete(customer);
    }

	public void addCustomer(Customer customer) {
		
		
	}

	public void updateCustomer(Customer customer) {
		
		
	}

	public void deleteCustomer(Customer customer) {
		
		
	}

	@Override
	public Object getAllCustomers() {
		
		return "cart.jsp";
	}

    
}





Object getAllCustomers();

}
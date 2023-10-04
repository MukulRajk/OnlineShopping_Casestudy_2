package in.mindcraft.daos;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.mindcraft.*;
import in.mindcraft.pojos.Product;



public interface ProductDao {
    Product getproductById(long productId);
    void addproduct(Product product);
    void updateproduct(Product product);
    void deleteproduct(Product product);
    Object getAllProducts1();
    // Additional methods as needed





@Repository
public class productDAOImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product getproductById(long productId) {
        return (Product) sessionFactory.getCurrentSession().get(Product.class, productId);
    }

    @Override
    public void addproduct(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void updateproduct(Product product) {
        sessionFactory.getCurrentSession().update(product);
    }

    @Override
    public void deleteproduct(Product product) {
        sessionFactory.getCurrentSession().delete(product);
    }

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getAllProducts1() {
		
		return null;
	}

	@Override
	public Object getAllProducts() {
		
		return null;
	}

    


}





void addProduct(Product product);
Object getAllProducts();
}
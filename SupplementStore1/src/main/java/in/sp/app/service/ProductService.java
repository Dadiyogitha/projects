package in.sp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.app.Entities.Product;
import in.sp.app.Respositories.ProductRepository;
@Service
public class ProductService {
	 @Autowired
	    private ProductRepository productRepository;

	    public Product addProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public Product updateProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public void deleteProduct(Integer productId) {
	        productRepository.deleteById(productId);
	    }

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    
	    }

		


package in.sp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.app.Entities.Product;
import in.sp.app.Respositories.ProductRepository;

@Service
public class DashboardService {
	@Autowired
	public ProductRepository productRepo;
	public List<Product> getAllProductsList(){
		return productRepo.findAll();
		
	}
	
	
	

}

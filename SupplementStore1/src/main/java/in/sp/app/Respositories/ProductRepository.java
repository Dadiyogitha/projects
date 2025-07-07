package in.sp.app.Respositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	

}

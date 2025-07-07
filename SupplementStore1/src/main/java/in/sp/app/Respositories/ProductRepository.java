package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

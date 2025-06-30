package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.entities.Product;

public interface ProductRespository extends JpaRepository<Product, Integer> {

}

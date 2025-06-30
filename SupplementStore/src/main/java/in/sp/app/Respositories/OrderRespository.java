package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.entities.Order;



public interface OrderRespository extends JpaRepository<Order, Integer> {

}

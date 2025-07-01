package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.Entities.Order;



public interface OrderRespository extends JpaRepository<Order, Integer> {

}

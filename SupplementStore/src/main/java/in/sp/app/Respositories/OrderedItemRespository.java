package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.entities.OrderedItem;



public interface OrderedItemRespository extends JpaRepository<OrderedItem, Integer> {

}

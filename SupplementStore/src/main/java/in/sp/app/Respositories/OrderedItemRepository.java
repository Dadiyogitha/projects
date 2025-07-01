package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.Entities.OrderedItem;



public interface OrderedItemRepository extends JpaRepository<OrderedItem, Integer> {

}

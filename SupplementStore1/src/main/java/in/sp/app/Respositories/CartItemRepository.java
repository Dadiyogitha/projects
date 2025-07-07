package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.Entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}

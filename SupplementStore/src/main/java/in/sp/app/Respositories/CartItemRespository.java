package in.sp.app.Respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.app.entities.CartItem;

public interface CartItemRespository extends JpaRepository<CartItem,Long> {

}

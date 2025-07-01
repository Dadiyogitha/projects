package in.sp.app.Entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart_Items")
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Cart_Items_Id")
	private long cid;
	@Column(name="Quantity")
	private int quantity;
	
	@CreationTimestamp
	@Column(name="cartItemAt")
	private LocalDateTime carttItemAt;
	
	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "ItemVariants_Id")
	private ItemVariants item_variants;
	
	@ManyToOne
    @JoinColumn(name="userid", referencedColumnName="User_id")
	private User user;

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getCarttItemAt() {
		return carttItemAt;
	}

	public void setCarttItemAt(LocalDateTime carttItemAt) {
		this.carttItemAt = carttItemAt;
	}

	public ItemVariants getItem_variants() {
		return item_variants;
	}

	public void setItem_variants(ItemVariants item_variants) {
		this.item_variants = item_variants;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}

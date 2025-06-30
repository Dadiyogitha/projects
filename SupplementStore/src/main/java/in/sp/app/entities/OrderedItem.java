package in.sp.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ordered_items")
public class OrderedItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ordered_Item_Id")
	private Long orderedItemId;
	@Column(name="Quantity")
	private int quantity;
	@Column(name="Price")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "Order_id")
	private Order order;
	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "ItemVariants_Id")
	private ItemVariants item_variants;
	public Long getOrderedItemId() {
		return orderedItemId;
	}
	public void setOrderedItemId(Long orderedItemId) {
		this.orderedItemId = orderedItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public ItemVariants getItem_variants() {
		return item_variants;
	}
	public void setItem_variants(ItemVariants item_variants) {
		this.item_variants = item_variants;
	}
    
	
	
}


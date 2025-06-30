package in.sp.app.details;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Item_Details")
public class ItemVariants {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ItemVariants_Id")
	private int id;
	@Column(name="Weight")
	private String weight;
	@Column(name="price")
	private String price;
	
	@ManyToOne
	@JoinColumn(name="itemId")
	private Product item;
	@OneToMany
	@JoinColumn(name = "ItemVariants_Id")
	private List<OrderedItem> ordereditems; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	

}

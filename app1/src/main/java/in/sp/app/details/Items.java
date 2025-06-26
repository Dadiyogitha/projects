package in.sp.app.details;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Items")
public class Items {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	@Column(name="Items_Name")
	private String itemName;
	@Column(name="Product_Descrption")
	private String description;
	@Column(name="Category")
	private String category;
	@OneToMany
	@JoinColumn(name="ItemVariants_Id")
	 private List<ItemVariants> itemVariants;
	 public int getItemId() {
		 return itemId;
	 }
	 public void setItemId(int itemId) {
		 this.itemId = itemId;
	 }
	 public String getItemName() {
		 return itemName;
	 }
	 public void setItemName(String itemName) {
		 this.itemName = itemName;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public String getCategory() {
		 return category;
	 }
	 public void setCategory(String category) {
		 this.category = category;
	 }
	 
	 
	
	
}

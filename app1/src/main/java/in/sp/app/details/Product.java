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
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	@Column(name="Iproduct_Name")
	private String productName;
	@Column(name="Product_Descrption")
	private String description;
	@Column(name="price")
	private double price;
	@Column(name="image")
	private String image;
	
	
	@OneToMany
	@JoinColumn(name="ItemVariants_Id")
	 private List<ItemVariants> itemVariants;
	 public int getItemId() {
		 return productId;
	 }
	 public void setProductId(int productId) {
		 this.productId = productId;
	 }
	 public String getProductName() {
		 return productName;
	 }
	 public void setProductName(String productName) {
		 this.productName = productName;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public Double getPrice() {
		 return price;
	 }
	 public void setPrice(double d) {
		 this.price = d;
	 }
	 public String getImage() {
		 return image;
	 }
	 public void setImage(String image) {
		 this.image = image;
	 }
	 public int getProductId() {
		 return productId;
	 }
	
	 
	
	
}

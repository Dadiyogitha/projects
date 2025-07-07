package com.in.supplementStore.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String lastName;
    private String email;
    private String phno;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
    @OneToMany(mappedBy = "user")
    private List<CartItem> cartItems;
    
	 private String firstName;
	    public Long getUserId() {
		return userId;
	}
	 public void setUserId(Long userId) {
		 this.userId = userId;
	 }
	 public String getFirstName() {
		 return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 public String getLastName() {
		 return lastName;
	 }
	 public void setLastName(String lastName) {
		 this.lastName = lastName;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public String getPhno() {
		 return phno;
	 }
	 public void setPhno(String phno) {
		 this.phno = phno;
	 }
	 public String getUsername() {
		 return username;
	 }
	 public void setUsername(String username) {
		 this.username = username;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 public List<Address> getAddresses() {
		 return addresses;
	 }
	 public void setAddresses(List<Address> addresses) {
		 this.addresses = addresses;
	 }
	 public List<CartItem> getCartItems() {
		 return cartItems;
	 }
	 public void setCartItems(List<CartItem> cartItems) {
		 this.cartItems = cartItems;
	 }
		

}
package com.in.supplementStore.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String status;
    private String orderedOn;

    @OneToMany(mappedBy = "order")
    private List<OrderedItem> orderedItems;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // This is where getUser() works

    // Getter & Setter for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderedOn() {
		return orderedOn;
	}

	public void setOrderedOn(String orderedOn) {
		this.orderedOn = orderedOn;
	}

	public List<OrderedItem> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(List<OrderedItem> orderedItems) {
		this.orderedItems = orderedItems;
	}

    // Getters and Setters
}

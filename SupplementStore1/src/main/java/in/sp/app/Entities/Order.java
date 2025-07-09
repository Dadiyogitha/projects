package in.sp.app.Entities;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

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
@Table(name="Order_details")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Orderid")
	private long orderid;
	@Column(name="Status")
	private String status;
	
	@CreationTimestamp
	@Column(name="Ordered_on")
	private LocalDateTime orderedOn;
	
	@ManyToOne
    @JoinColumn(name="userid", referencedColumnName="userid")
	private User user;
	
	@OneToMany
	@JoinColumn(name="Orderid")
	private List<OrderedItem> orderitems;
 
	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getOrderedOn() {
		return orderedOn;
	}

	public void setOrderedOn(LocalDateTime orderedOn) {
		this.orderedOn = orderedOn;
	}
	
	

}

package in.sp.app.details;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="User_Details")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_id")
	private int userid;
	@Column(name="First_Name")
	private String FirstName;
	@Column(name="Last_Name")
	private String LastName;
	@Column(name="Email")
	private String email;
	@Column(name="Phno")
	private String phno;
	@Column(name="UserName")
	private String username;
	@Column(name="Password")
	private String password;
	
	@OneToMany
	@JoinColumn(name="User_id")
	private List<Address> address;
	
	@OneToMany
	@JoinColumn(name="User_id")
	private List<Order> order;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	

}

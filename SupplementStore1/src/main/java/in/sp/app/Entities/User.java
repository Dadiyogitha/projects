package in.sp.app.Entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="User_Details")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int userid;
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	
	private String phno;

	private String username;
	
	private String password;
	
	@OneToMany
	@JoinColumn(name="userid")
	private List<Address> address;
	
	@OneToMany
	@JoinColumn(name="userid")
	private List<Order> order;
	
	public User() {}

	public User(String firstname, String lastname, String email, String phno, String username, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phno = phno;
		this.username = username;
		this.password = password;
	}
	
	public String getFirstName() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	
	@Override
	public String toString() {
		return "User{" +
				"userid=" + userid +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", email='" + email + '\'' +
				", phno='" + phno + '\'' +
				", username='" + username + '\'' +
				'}';
	}

}

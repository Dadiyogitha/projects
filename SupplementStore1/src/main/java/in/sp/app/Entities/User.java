package in.sp.app.Entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="User_Details")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_id")
	private int userid;
	@Column(name="Firstname")
	private String firstname;
	@Column(name="Lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	
	@Column(name="Phno")
	private String phno;
	@Column(name="Username")
	private String username;
	@Column(name="Password")
	private String password;
	
	@OneToMany
	@JoinColumn(name="User_id")
	private List<Address> address;
	
	@OneToMany
	@JoinColumn(name="User_id")
	private List<Order> order;
	
	public User() {}

	public User(String firstNname, String lastname, String email, String phno, String username, String password) {
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
	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
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

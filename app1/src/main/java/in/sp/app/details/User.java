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
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
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
	
	public User() {}

	public User(String firstName, String lastName, String email, String phno, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phno = phno;
		this.username = username;
		this.password = password;
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
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				", phno='" + phno + '\'' +
				", username='" + username + '\'' +
				'}';
	}

}

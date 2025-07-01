package in.sp.app.Controller;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.app.Entities.User;
import in.sp.app.Service.DashboardService;
import in.sp.app.Service.LoginService;
import in.sp.app.Utils.DbCon;
@Controller
@RequestMapping("/store")
public class LoginController {	
	@RequestMapping("/register")
	public String getRegisterpage() {
		return "register";	
	}
	@Autowired
	public DashboardService dashboardService;
	@Autowired
	public LoginService loginService;
	  @GetMapping("/login")
	    public String showLoginForm() {
	        return "login"; 
	    }
	@PostMapping("/authWithSpringData")
	public String auth(@RequestParam("username") String username, @RequestParam("password") String password,Model m) {
		User loggedinUser =loginService.authUserBySpringData(username, password);
		if(loggedinUser !=null) {
			m.addAttribute("loggedinUser", loggedinUser);
			m.addAttribute("productList",dashboardService.getAllProductsList());
			m.addAttribute("imageStyle", "style='width:auto; height:auto; max-width:auto;'");
			return "dashboard";
		}
		else {
		return password;
		}
		
		
		
	}
	@RequestMapping("/login1")
	public String getLoginpage() {
		return "login";
		
	}
	@RequestMapping("/dashboard")
	public String getDashboardpage() {
		return "dashboard";
		
	}
	
	@RequestMapping("/abc")
	public String authenticateUser1(@RequestParam("user_name") String username, @RequestParam("password") String password, Model m) {
		User user1=null;
		if( username.equals("admin")&&password.equals("admin"))
		{
			User loggedinUser=new User();
			loggedinUser.setFirstName("admin");
			loggedinUser.setLastName("admin");
			m.addAttribute("userObj",loggedinUser);
			return null;
			
		}
		return "register";
		}
	@GetMapping("/auth")
	public String authenticateUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		try {
			Connection conn = DbCon.getCon();
			String query = "select * from User_Details";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt(1) + " firstname: " + rs.getString("firstName"));
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}

}

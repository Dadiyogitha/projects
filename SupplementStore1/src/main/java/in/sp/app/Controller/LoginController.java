package in.sp.app.Controller;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.app.Entities.User;
import in.sp.app.Service.DashboardService;
import in.sp.app.Service.LoginService;
import in.sp.app.Service.UserService;
import in.sp.app.Utils.DbCon;
@Controller
@RequestMapping("/store")
public class LoginController {	
	public UserService userService;
	 @GetMapping("/register")
	    public String registerPage(Model model) {
	        model.addAttribute("user", new User());
	        return "register";
	    }

	    @PostMapping("/register")
	    public String registerUser(@ModelAttribute User user, Model model) {
	        try {
	            String message = userService.saveUser(user);
	            model.addAttribute("message", message);
	            return "RegisterSuccess";
	        } catch (Exception e) {
	            model.addAttribute("error", "Error registering user");
	            return "register";
	        }
	    }

	@Autowired
	public DashboardService dashboardService;
	@Autowired
	public LoginService loginService;
	
	
	@GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password, Model model) {
        try {
            List<User> user = userService.findByUsernameAndPassword(username, password);
            if (user != null) {
                return "redirect:/products";
            } else {
                model.addAttribute("error", "Invalid username or password");
                return "login";
            }
        } catch (Exception e) {
            model.addAttribute("error", "Error logging in");
            return "login";
        }
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
	
	


}

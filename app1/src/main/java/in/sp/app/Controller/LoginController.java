package in.sp.app.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.app.details.DbCon;
@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/auth")
	public String authenticateUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		try {
			Connection conn = DbCon.getConnection();
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

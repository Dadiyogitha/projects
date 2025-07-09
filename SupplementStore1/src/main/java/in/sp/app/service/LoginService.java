package in.sp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.app.Entities.User;
import in.sp.app.Respositories.UserRepository;
@Service
public class LoginService {
	
	@Autowired
	public UserRepository userRepo;
	public User authUserBySpringData(String username,String password) {
		List<User> userList=userRepo.findByUsernameAndPassword(username, password);
		if(userList.size()==1) {
			return userList.get(0);
		}
		return null;
		
	}
	

}

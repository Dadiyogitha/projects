package in.sp.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.app.Entities.User;
import in.sp.app.Respositories.UserRepository;
@Service
public class LoginService {
	
	@Autowired
	public UserRepository userRepo;
	public User authUserBySpringData(String userName,String password) {
		List<User> userList=userRepo.findByUsernameAndPassword(userName, password);
		if(userList.size()==1) {
			return userList.get(0);
		}
		return null;
		
	}
	

}

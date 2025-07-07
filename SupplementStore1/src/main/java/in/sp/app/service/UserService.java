package in.sp.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.app.Entities.User;
import in.sp.app.Respositories.UserRepository;


@Service
public class UserService {
    @Autowired
    public UserRepository userRepo;
       
    public String saveUser(User user) {
    	try {
        userRepo.save(user);
        return "Registration successful!";
      }
    catch(Exception e) {
    	e.printStackTrace(); 
    	 return"Error registering user";
         
    }
    	
    }

    public List<User> findByUsernameAndPassword(String username, String password) {
        return userRepo.findByUsernameAndPassword(username, password);
    }
}
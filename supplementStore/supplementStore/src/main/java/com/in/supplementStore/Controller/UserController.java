package com.in.supplementStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.in.supplementStore.Entities.User;
import com.in.supplementStore.Service.UserService;


@Controller
public class UserController {
	    @Autowired
	    private UserService userService; // Correctly autowiring the service

	    @GetMapping("/register")
	    public String showRegistrationForm(Model model) {
	        model.addAttribute("user", new User());
	        return "register";
	    }

	  @PostMapping("/register")
	    public String registerUser (User user) {
	        userService.registerUser (user);
	        return "redirect:/user/login";
	    }

	    @GetMapping("/login")
	    public String showLoginForm() {
	        return "login";
	    }

	    @GetMapping("/profile")
	    public String userProfile1(Model model) {
	        Long userId = 1L; // Replace with actual logged-in user ID
	        model.addAttribute("user", userService.getUserById(userId));
	        return "user_profile";
	    }
	

   /*
    @GetMapping("/user/profile")
    public String userProfile(Model model) {
        Long userId = 1L; // In a real app, get from session/authentication
        User user = userService.getUserById(userId);
        List<Order> orders = orderService.getOrdersByUserId(userId);
        List<CartItem> cartItems = cartService.getCartItemsByUserId(userId);
        List<Address> addresses = addressService.getUserAddresses(userId);

        model.addAttribute("user", user);
        model.addAttribute("orders", orders);
        model.addAttribute("cartItems", cartItems);
        //model.addAttribute("addresses", addresses);
        return "user_profile";
    }

    @GetMapping("/user/profile/edit")
    public String editProfileForm(Model model) {
        Long userId = 1L; // In a real app, get from session/authentication
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "edit_profile";
    }

    //@PostMapping("/user/profile/update")
    public String updateProfile(User user) {
        userService.updateUser(user);
        return "redirect:/user/profile";
    }
    */
}

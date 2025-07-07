package com.in.supplementStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.in.supplementStore.Entities.CartItem;
import com.in.supplementStore.Service.CartService;

import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/")
    public String viewCart(Model model) {
        // Assuming userId is obtained from session or authentication context
        Long userId = 1L; // Replace with actual user ID
        List<CartItem> cartItems = cartService.getCartItemsByUserId(userId);
        model.addAttribute("cartItems", cartItems);
        return "cart";
    }

    @PostMapping("/add")
    public String addCartItem(CartItem cartItem) {
        cartService.addCartItem(cartItem);
        return "redirect:/cart/";
    }

    @GetMapping("/remove/{id}")
    public String removeCartItem(@PathVariable Long id) {
        cartService.removeCartItem(id);
        return "redirect:/cart/";
    }
}

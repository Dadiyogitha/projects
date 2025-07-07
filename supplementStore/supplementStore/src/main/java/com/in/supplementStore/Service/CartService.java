package com.in.supplementStore.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.supplementStore.Entities.CartItem;
import com.in.supplementStore.Repositories.CartItemRepository;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartItemRepository;
	public List<CartItem> getCartItemsByUser;

    public CartItem addCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public void removeCartItem(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }

    public List<CartItem> getCartItemsByUserId(Long userId) {
        List<CartItem> allItems = cartItemRepository.findAll();
        List<CartItem> userItems = new ArrayList<>();

        for (CartItem item : allItems) {
            if (item.getUser() != null && item.getUser().getUserId().equals(userId)) {
                userItems.add(item);
            }
        }

        return userItems;
    }
}
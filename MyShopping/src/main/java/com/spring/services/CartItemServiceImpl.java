package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.spring.dao.CartItemDao;
import com.spring.dao.CartItemService;
import com.spring.model.CartItem;
@Service
public class CartItemServiceImpl implements CartItemService{
	@Autowired
private CartItemDao cartItemDao;

	public CartItemDao getCartItemDao() {
		return cartItemDao;
	}

	public void setCartItemDao(CartItemDao cartItemDao) {
		this.cartItemDao = cartItemDao;
	}

	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem);
	}

}

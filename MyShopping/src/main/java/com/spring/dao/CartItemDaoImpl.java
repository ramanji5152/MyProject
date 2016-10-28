package com.spring.dao;

import java.io.IOException;

import javax.websocket.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Cart;
import com.spring.model.CartItem;

import antlr.collections.List;

@Repository
public class CartItemDaoImpl implements CartItemDao {
	@Autowired
private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCartItem1(CartItem cartItem) throws IOException {
		Session session=(Session) sessionFactory.openSession();
		((org.hibernate.Session) session).saveOrUpdate(cartItem);
		((org.hibernate.Session) session).flush();
		session.close();
		
	}public void removeCartItem(int cartItemId) {
		Session session=(Session) sessionFactory.openSession();
		CartItem cartItem=
			(CartItem)((org.hibernate.Session) session).get(CartItem.class, cartItemId);
		((org.hibernate.Session) session).delete(cartItem);
		((org.hibernate.Session) session).flush();
		session.close();
	}

	public void removeAllCartItems(Cart cart) {
		int cartItems=cart.getCartId();
		for(CartItem cartItem:cartItems){
			removeCartItem(cartItem.getCartItemId());
		}
		
	}

	public void addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		
	}

	public void removeAllCartItems(int cartId) {
		// TODO Auto-generated method stub
		
	}

}


package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Cart;
import com.spring.model.CartItem;
@Repository
public class CartDaoImpl implements CartItemDao{
	@Autowired
private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
	return sessionFactory;
}
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
public Cart getCartByCartId(int cartId) {
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class, cartId);
		System.out.println(cart.getCartId() + " " + cart.getCartId());
		return cart;
}
public void addCartItem(CartItem cartItem) {
	// TODO Auto-generated method stub
	
}
public void removeCartItem(int cartItemId) {
	// TODO Auto-generated method stub
	
}
public void removeAllCartItems(int cartId) {
	// TODO Auto-generated method stub
	
}
}

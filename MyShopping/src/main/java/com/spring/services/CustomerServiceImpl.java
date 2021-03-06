package com.spring.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.spring.dao.CustomerDao;
import com.spring.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerServices{
	@Autowired
private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
	return customerDao;
}

public void setCustomerDao(CustomerDao customerDao) {
	this.customerDao = customerDao;
}
@Transactional
	public void addCustomer(Customer customer) {
		
		customerDao.addCustomer(customer);
	}
public List<Customer> getAllCustomers() {
	return customerDao.getAllCustomers();
}
public Customer getCustomerByUsername (String username){
return customerDao.getCustomerByUsername(username);
}

public String registerCustomer(Customer customer, BindingResult result, Model model) {
	// TODO Auto-generated method stub
	return null;
}



}

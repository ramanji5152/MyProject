package com.spring.services;
import java.util.List;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Customer;

public interface CustomerServices {
void addCustomer(Customer customer);
List<Customer> getAllCustomers();

//to insert the data 
@RequestMapping(value="/customer/registration",method=RequestMethod.POST)
public String registerCustomer(@Valid @ModelAttribute(value="customer")Customer customer,
		BindingResult result,Model model);
Customer getCustomerByUsername(String username);

}

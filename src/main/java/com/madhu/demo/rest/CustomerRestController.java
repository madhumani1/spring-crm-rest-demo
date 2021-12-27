/**
 * 
 */
package com.madhu.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.demo.entity.Customer;
import com.madhu.demo.exception.CustomerNotFoundException;
import com.madhu.demo.service.CustomerService;

/**
 * @author 15197
 *
 */
@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// autowire the CustomerService
	@Autowired
	private CustomerService customerService;
	
	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers()	{
		return customerService.getCustomers();
	}
	
	// add mapping for GET /customers/{customerId}
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId)	{
		Customer theCustomer = customerService.getCustomer(customerId);
		// if customer id is not found in database, it returns null 
		// then Jackson will return empty body for null objects.
		// NOW what if we need to give 404 status (or any valid HTTP status) for each bad cases?
		// for this we need to add Exception classes - CustomerErrorResponse, 
		// CustomerNotFoundException and CustomerRestExceptionHandler.
		if (theCustomer == null) {
			throw new CustomerNotFoundException("Customer id not found - " + customerId);
		}
		return theCustomer;
	}
}

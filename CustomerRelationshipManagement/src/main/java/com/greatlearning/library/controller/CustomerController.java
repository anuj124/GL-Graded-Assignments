package com.greatlearning.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.library.entity.Customer;
import com.greatlearning.library.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/list")
	public String listCustomer(Model model) {
		List<Customer> theCustomers = customerService.findAll();
		model.addAttribute("Customers", theCustomers);
		return "list-Customers";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Customer theCustomer = new Customer();
		model.addAttribute("Customer", theCustomer);
		return "Customer-form";
	}

	@RequestMapping("showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int customerId, Model model) {
		Customer theCustomer = customerService.findByID(customerId);
		model.addAttribute("Customer", theCustomer);
		return "Customer-form";
	}

	@PostMapping("/save")
	public String delete(@RequestParam("customerId") int customerId, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("email") String email) {

		Customer theCustomer;
		if(customerId!=0) {
			theCustomer = customerService.findByID(customerId);
			theCustomer.setFirstName(firstName);
			theCustomer.setLastName(lastName);
			theCustomer.setEmail(email);
		}
		else 
			theCustomer = new Customer(firstName, lastName, email);
		
		customerService.save(theCustomer);
		return "redirect:/customer/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("customerId") int customerId) {
		customerService.deleteById(customerId);
		return "redirect:/customer/list";
		
	}
}

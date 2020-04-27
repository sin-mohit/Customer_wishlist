package com.techms.itemwishlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techms.itemwishlist.model.CustomerWishList;
import com.techms.itemwishlist.service.CustomerWishListService;

@RestController
@RequestMapping("/customerWishLists")
public class CustomerWishListController {

	@Autowired
	private CustomerWishListService customerWishListService;

	@RequestMapping("/getAll")
	public List<CustomerWishList> getAllWishLists() {	
		return customerWishListService.getAllWishLists();
	}

	@RequestMapping("/getOne")
	public List<CustomerWishList> getWishList(@RequestParam(value="customerId") String customerId) {
		return customerWishListService.getWishList(customerId);
	}

	@RequestMapping(method=RequestMethod.POST, value="/add")
	public void addWishList(@RequestBody CustomerWishList customerWishList) {
		customerWishListService.addWishList(customerWishList);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/delete")
	public void deleteWishList(@RequestParam(value="itemName") String itemName, @RequestParam(value="customerId", required=false) String customerId) {
		customerWishListService.deleteWishList(itemName, customerId); 
	}

}

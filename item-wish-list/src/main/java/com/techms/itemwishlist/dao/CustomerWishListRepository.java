package com.techms.itemwishlist.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.techms.itemwishlist.model.CustomerWishList;

public interface CustomerWishListRepository extends CrudRepository<CustomerWishList, Integer>{
	
	  public List<CustomerWishList> findByCustomerId(String customerId);
	  
	  public void deleteByItemNameAndCustomerId(String itemName, String customerId);
}

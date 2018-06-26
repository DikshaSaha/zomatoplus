/*package com.thinkxfactor.zomatoplus.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;

@RestController
@RequestMapping("/restuarant")
public class RestaurantController {

	static Set<Restaurant> restaurantSet;
	
	@PostMapping("/create")
	public Restaurant create(@RequestBody Restaurant rest)
	{
		if(restaurantSet.contains(rest))
		{
			System.out.println("Restaurant already registered.");
			return null;
		}
		else
		{
			restaurantSet.add(rest);
			System.out.println("Registration successful!");
			return rest;
		}
	}
	
	@GetMapping("/getall")
	public Set<Restaurant> getAllRestaurant()
	{
		return restaurantSet;
	}
	
	@PostMapping("/additem")
	public Items addItem(@RequestBody Restaurant rest, @RequestBody Items items)
	{
		rest.setItem(items);
		return items;
		
	}
	
	 @PostMapping("/additems")
	public Set<Items> addItems(@RequestBody Restaurant rest, @RequestBody Set<Items> itemSet)
	{
		itemSet.forEach(item->rest.setItem(item));
		return itemSet;
		
	}
	 
	@GetMapping("/restuarantitems")
	public Set<Items> restaurantItems(@RequestBody Restaurant rest)
	{
		return rest.getItemSet();
	}
	
}		
*/
package com.thinkxfactor.zomatoplus.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.ItemRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repo.UserRepository;

@RestController
@RequestMapping("/restuarant")
public class RestaurantController {

	@Autowired
	private RestaurantRepository restaurantRepository;
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		Restaurant persistedRestaurant=restaurantRepository.save(restaurant);
		return persistedRestaurant;
	}
	@GetMapping("/getAll")
	public List<Restaurant> getAll()
	{
		List<Restaurant> restaurants=restaurantRepository.findAll();
		return restaurants;
	}
	
	@PostMapping("/add_items")
	public Items addItem(@RequestBody Items item)
	{
		Items persistedItem=itemRepository.save(item);
		return persistedItem;
		
	}
}		
 




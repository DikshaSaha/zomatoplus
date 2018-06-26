/*package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;
import java.util.Set;
//import java.util.Map;

public class Restuarant implements Serializable{
	
		private String restID;
		//protected String restID;
		private String restName;
		private String type;
		private String description;
		private String website;
		private String phno;
		private String address;
		private static Set<Items> itemSet;
		//private static Map<String, Items> itemMap;

		public Restuarant(String restID, String restName, String type, String description, String website, String phno, String address) {
			super();
			this.restID=restID;
			this.restName=restName;
			this.type=type;
			this.description=description;
			this.website=website;
			this.phno=phno;
			this.address=address;
		}
		
		public Restuarant() {
			super();
		}
				
		public Set<Items> getItemSet() {
			return itemSet;
		}
		/*
		 public Items[] getItems() {
			return itemMap.values();
		}
		 */
		/*public void setItem(Items item) {
			itemSet.add(item);
		}*/
		/*
		 public void setItem(Items item) {
			itemMap.put(item.itemID, item);
		}*/
		 
		
		/*public boolean equals(Object obj)
		{
			Restuarant that=(Restuarant)obj;
			if((this.restID).equals(that.restID))
				return true;
			return false;
		}		

}
*/
package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

		@Entity
		@Table(name="tbl_restaurant")
		public class Restaurant implements Serializable{
		@Id
		@Column(name="restaurant_id")
		private Long id;
		@Column(name="name")
		private String name;
		@Column(name="city")
		private String city;
		@Column(name="description")
		private String description;
		@Column(name="website")
		private String website;
		@Column(name="contact")
		private String contact;
		@Column(name="address")
		private String address;
		@Column(name="like_count")
		private Integer likeCount;
		private static Set<Items> itemSet;

		public Restaurant(Long id, String name, String city, Integer likeCount, String description, String website, String contact, String address) {
			super();
			this.id=id;
			this.name=name;
			this.description=description;
			this.website=website;
			this.contact=contact;
			this.city=city;
			this.likeCount=likeCount;
			this.address=address;
		}
		
		public Restaurant() {
			super();
		}
				
		
		
		
		public boolean equals(Object obj)
		{
			Restaurant that=(Restaurant)obj;
			if((this.id).equals(that.id))
				return true;
			return false;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Integer getLikeCount() {
			return likeCount;
		}

		public void setLikeCount(Integer likeCount) {
			this.likeCount = likeCount;
		}

		public static void setItemSet(Set<Items> itemSet) {
			Restaurant.itemSet = itemSet;
		}		

}


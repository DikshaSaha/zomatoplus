package com.thinkxfactor.zomatoplus.models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="name")
	private String username;
	@Column(name="type")
	private String type;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private String pincode;
	@Column(name="password")
	private String password;
	
	

	public User() {
		super();
	}
	
	public User(Long id, String username, String type, String mobile, String address, String landmark, String pincode,
			String password) {
		super();
		this.id = id;
		this.username = username;
		this.type = type;
		this.mobile = mobile;
		this.address = address;
		this.landmark = landmark;
		this.pincode = pincode;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean equals(Object obj)
	{
		User that=(User)obj;
		if((this.username).equals(that.username))
			return true;
		return false;
	}


}

	/*package com.thinkxfactor.zomatoplus.models;
	import java.io.Serializable;
	

	
	public class User implements Serializable{
		
		private String username;
		private String password;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean equals(Object obj)
	{
		User that=(User)obj;
		if((this.username).equals(that.username))
			return true;
		return false;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
	}
	

}*/

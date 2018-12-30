package edu.ptit.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1959528370489096046L;
	private int id;
	private String username;
	private String password;
	private String fullName;	
	private String email;
	private String address;
	private String phone;
	private String createdDate;
	private int role;
	private boolean banned;
	
	public boolean isBanned() {
		return banned;
	}

	public void setBanned(boolean isBanned) {
		this.banned = isBanned;
	}

	public User() {
		super();
	}
	
	public User(int id, String username, String password, String email, int role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public User(int id, String username, String password, String fullName, String email, String address, String phone, int role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", fullName=" + fullName
				+ ", email=" + email + ", address=" + address + ", phone=" + phone + ", createdDate=" + createdDate
				+ ", role=" + role + "]";
	}
	
}

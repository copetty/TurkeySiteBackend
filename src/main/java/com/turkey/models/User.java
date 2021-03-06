package com.turkey.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="USERS")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="userSequence")
	@SequenceGenerator(name="userSequence", sequenceName="USER_SEQ", allocationSize=1)
	private int id;
	
	@Column(name="USERNAME", unique=true, nullable=false, columnDefinition="VARCHAR")
	private String username;
	
	@Column(name="USER_PASSWORD", unique=false, nullable=false, columnDefinition="VARCHAR")
	private String password;
	
	@Column(name="FIRST_NAME", unique=false, nullable=false, columnDefinition="VARCHAR")
	private String firstName;
	
	@Column(name="LAST_NAME", unique=false, nullable=false, columnDefinition="VARCHAR")
	private String lastName;
	
	@Column(name="BALANCE", unique=false, nullable=false, columnDefinition="NUMERIC")
	private int balance;
	
	@Column(name="SAVED_CALL", unique=false, nullable=true, columnDefinition="VARCHAR")
	private String savedCall;
	
	@Column(name="PURCHASED_CALL", unique=false, nullable=true, columnDefinition="VARCHAR")
	private String purchasedCall;

	public User() {
		super();
	}
	
	

	public User(String username) {
		super();
		this.username = username;
	}



	public User(String username, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String username, String password, String firstName, String lastName, int balance) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public User(int id, String username, String password, String firstName, String lastName, int balance) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public User(int id, String username, String password, String firstName, String lastName, int balance,
			String savedCall, String purchasedCall) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.savedCall = savedCall;
		this.purchasedCall = purchasedCall;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getSavedCall() {
		return savedCall;
	}

	public void setSavedCall(String savedCall) {
		this.savedCall = savedCall;
	}

	public String getPurchasedCall() {
		return purchasedCall;
	}

	public void setPurchasedCall(String purchasedCall) {
		this.purchasedCall = purchasedCall;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((purchasedCall == null) ? 0 : purchasedCall.hashCode());
		result = prime * result + ((savedCall == null) ? 0 : savedCall.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (balance != other.balance)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (purchasedCall == null) {
			if (other.purchasedCall != null)
				return false;
		} else if (!purchasedCall.equals(other.purchasedCall))
			return false;
		if (savedCall == null) {
			if (other.savedCall != null)
				return false;
		} else if (!savedCall.equals(other.savedCall))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", balance=" + balance + ", savedCall=" + savedCall + ", purchasedCall="
				+ purchasedCall + "]";
	}
	
	
	
	

}

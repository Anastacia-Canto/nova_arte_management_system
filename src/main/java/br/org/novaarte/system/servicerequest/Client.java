package br.org.novaarte.system.servicerequest;

import java.io.Serializable;


public class Client implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private Integer phoneNumber;
	
	public Client(String name, String email, Integer phone) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phone;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ");
		sb.append(name);
		sb.append("\nemail: ");
		sb.append(email);
		sb.append("\nphoneNumber: ");
		sb.append(phoneNumber);
		return sb.toString();
	}
	
}

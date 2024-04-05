package br.org.novaarte.system.servicerequest.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Integer phoneNumber;

	// This is mapped by foreign key on Form table
	// The cascade is used on parent entity to propagate SELECT, INSERT, UPDATE, DELETE to child entity database
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Form> forms = new ArrayList<>();
	
	public Client(){}
	public Client(String name, String email, Integer phone) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public List<Form> getForms() {
		return forms;
	}

//	public void setForm(Form form) {
//		this.form = form;
//	}

	public void addForm(Form form) { this.forms.add(form); }
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nname: ");
		sb.append(name);
		sb.append("\nemail: ");
		sb.append(email);
		sb.append("\nphoneNumber: ");
		sb.append(phoneNumber);
		return sb.toString();
	}
	
}

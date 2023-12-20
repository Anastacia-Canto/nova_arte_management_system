package br.org.novaarte.system.servicerequest.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity // This tells Hibernate to make a table out of this class
public class Form implements Serializable {
	
	/*
	 * Serializable allow object serialization that is the conversion of Java object into byte streams.
	 * It is important to allow to pass an instance of this entity by value as a detached object, it means to leave the domain of the JVM.
	 * */
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(mappedBy = "form")
	private Client client;

	@OneToOne(mappedBy = "form")
	private Event event;
	private boolean requestSound;
	private boolean requestLighting;
	private boolean mealToVolunteers;
	private String additionalInfo;

	public Form(){}
	public Form(Client client, Event event, boolean requestSound, boolean requestLighting, boolean mealToVolunteers, String additionalInfo) {
		this.client = client;
		this.event = event;
		this.requestSound = requestSound;
		this.requestLighting = requestLighting;
		this.mealToVolunteers = mealToVolunteers;
		this.additionalInfo = additionalInfo;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public boolean isRequestSound() {
		return requestSound;
	}

	public void setRequestSound(boolean requestSound) {
		this.requestSound = requestSound;
	}

	public boolean isRequestLighting() {
		return requestLighting;
	}

	public void setRequestLighting(boolean requestLighting) {
		this.requestLighting = requestLighting;
	}

	public boolean isMealToVolunteers() {
		return mealToVolunteers;
	}

	public void setMealToVolunteers(boolean mealToVolunteers) {
		this.mealToVolunteers = mealToVolunteers;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: ");
		sb.append(id);
		sb.append("\nclient: \n");
		sb.append(client);
		sb.append("\nevent: \n");
		sb.append(event);
		sb.append("\nrequestSound: ");
		sb.append(requestSound);
		sb.append("\nrequestLighting: ");
		sb.append(requestLighting);
		sb.append("\nmealToVolunteers: ");
		sb.append(mealToVolunteers);
		sb.append("\nadditionalInfo: ");
		sb.append(additionalInfo);
		return sb.toString();
	}
	
	
	
}

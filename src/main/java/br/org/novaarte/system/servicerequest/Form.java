package br.org.novaarte.system.servicerequest;

public class Form {
	
	private Client client;
	private Event event;
	private boolean requestSound;
	private boolean requestLighting;
	private boolean mealToVolunteers;
	private String additionalInfo;
	
	public Form(Client client, Event event, boolean requestSound, boolean requestLighting, boolean mealToVolunteers, String additionalInfo) {

		this.client = client;
		this.event = event;
		this.requestSound = requestSound;
		this.requestLighting = requestLighting;
		this.mealToVolunteers = mealToVolunteers;
		this.additionalInfo = additionalInfo;
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
	
	
	
}

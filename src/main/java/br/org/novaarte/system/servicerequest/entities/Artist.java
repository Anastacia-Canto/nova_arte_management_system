package br.org.novaarte.system.servicerequest.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Artist implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String type;
	private List<String> instruments;
	private int voices;
	private LocalDateTime showBeginning;
	private LocalDateTime showEnding;
	
	@ManyToOne
	private Event event;
	
	public Artist(){}
	public Artist(String name, String type, List<String> instruments, int voices, LocalDateTime showBeginning,
			LocalDateTime showEnding, Event event) {
		this.name = name;
		this.type = type;
		this.instruments = instruments;
		this.voices = voices;
		this.showBeginning = showBeginning;
		this.showEnding = showEnding;
		this.event = event;

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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public List<String> getInstruments() {
		return instruments;
	}


	public void setInstruments(List<String> instruments) {
		this.instruments = instruments;
	}


	public int getVoices() {
		return voices;
	}


	public void setVoices(int voices) {
		this.voices = voices;
	}


	public LocalDateTime getShowBeginning() {
		return showBeginning;
	}


	public void setShowBeginning(LocalDateTime showBeginning) {
		this.showBeginning = showBeginning;
	}


	public LocalDateTime getShowEnding() {
		return showEnding;
	}


	public void setShowEnding(LocalDateTime showEnding) {
		this.showEnding = showEnding;
	}
	
	public Event getEvent() {
		return event;
	}
	
	public void setEvent(Event event) {
		this.event = event;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		sb.append("id: ");
//		sb.append(id);
		sb.append("\nname: ");
		sb.append(name);
		sb.append("\ntype: ");
		sb.append(type);
		sb.append("\ninstruments: ");
		sb.append(instruments);
		sb.append("\nvoices: ");
		sb.append(voices);
		sb.append("\nshowBeginning: ");
		sb.append(showBeginning);
		sb.append("\nshowEnding: ");
		sb.append(showEnding);
		
		return sb.toString();
	}
	

}

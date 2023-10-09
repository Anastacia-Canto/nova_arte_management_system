package br.org.novaarte.system.servicerequest;

import java.time.LocalDateTime;
import java.util.List;

public class Artist {
	
	private String name;
	private String type;
	private List<String> instruments;
	private int voices;
	private LocalDateTime showBeginning;
	private LocalDateTime showEnding;
	
	
	public Artist(String name, String type, List<String> instruments, int voices, LocalDateTime showBeginning,
			LocalDateTime showEnding) {
		this.name = name;
		this.type = type;
		this.instruments = instruments;
		this.voices = voices;
		this.showBeginning = showBeginning;
		this.showEnding = showEnding;
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
	
	

}

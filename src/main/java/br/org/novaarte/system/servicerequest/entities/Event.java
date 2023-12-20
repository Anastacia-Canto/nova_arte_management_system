package br.org.novaarte.system.servicerequest.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private LocalDateTime begin;
	private LocalDateTime end;

	@OneToMany
	@JoinColumn(name = "event_id")
	private List<Artist> artists = new ArrayList<>();
	private String address;
	private String locationName;
	private int locationCapacity;
	private String stageDimensions;
	@OneToOne
	private Form form;

	public Event(){}
	public Event(String name, LocalDateTime begin, LocalDateTime end, String address, String locationName, int locationCapacity, Form form) {
		this.name = name;
		this.begin = begin;
		this.end = end;
		this.address = address;
		this.locationName = locationName;
		this.locationCapacity = locationCapacity;
		this.form = form;
	}
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBegin() {
		return begin;
	}

	public void setBegin(LocalDateTime begin) {
		this.begin = begin;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getLocationCapacity() {
		return locationCapacity;
	}

	public void setLocationCapacity(int locationCapacity) {
		this.locationCapacity = locationCapacity;
	}

	public String getStageDimensions() {
		return stageDimensions;
	}

	public void setStageDimensions(String stageDimensions) {
		this.stageDimensions = stageDimensions;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("\nname: ");
		sb.append(name);
		sb.append("\nbegin: ");
		sb.append(begin);
		sb.append("\nend: ");
		sb.append(end);
		sb.append("\nartists: ");
		sb.append(artists);
		sb.append("\naddress: ");
		sb.append(address);
		sb.append("\nlocationName: ");
		sb.append(locationName);
		sb.append("\nlocationCapacity: ");
		sb.append(locationCapacity);
		sb.append("\nstageDimensions: ");
		sb.append(stageDimensions);
		
		return sb.toString();
	}
	
	
	

}

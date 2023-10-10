package br.org.novaarte.system.servicerequest;

import java.time.LocalDateTime;
import java.util.List;

public class Event {
	
	private String name;
	private LocalDateTime begin;
	private LocalDateTime end;
	private List<Artist> artists;
	private String address;
	private String locationName;
	private int locationCapacity;
	private String stageDimensions;
	
	public Event(String name, LocalDateTime begin, LocalDateTime end, List<Artist> artists, String address, String locationName, int locationCapacity) {
		this.name = name;
		this.begin = begin;
		this.end = end;
		this.artists = artists;
		this.address = address;
		this.locationName = locationName;
		this.locationCapacity = locationCapacity;
	}

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
		sb.append("name: ");
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

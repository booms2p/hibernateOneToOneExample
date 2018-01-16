package com.waramun;

public class StadiumDetail implements java.io.Serializable {
	
	private Integer stadiumId, capacity;
	private String stadiumName;
	private EplClub eplClub;
	
	public StadiumDetail() {}
	
	public StadiumDetail(Integer stadiumId, Integer capacity, String stadiumName, EplClub eplClub) {
		this.stadiumId = stadiumId;
		this.capacity = capacity;
		this.stadiumName = stadiumName;
		this.eplClub = eplClub;
	}

	public Integer getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public EplClub getEplClub() {
		return eplClub;
	}

	public void setEplClub(EplClub eplClub) {
		this.eplClub = eplClub;
	}
	

}

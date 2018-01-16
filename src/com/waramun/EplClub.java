package com.waramun;

public class EplClub implements java.io.Serializable {
	
	private Integer clubId, stadiumId, latestEplChamp;
	private String clubName;
	private StadiumDetail stadiumDetail;
	
	public EplClub() {}
	
	public EplClub(String clubName, Integer stadiumId, Integer latestEplChamp) {
		this.clubName = clubName;
		this.stadiumId = stadiumId;
		this.latestEplChamp = latestEplChamp;
	}
	
	public EplClub(String clubName, Integer stadiumId, Integer latestEplChamp, StadiumDetail stadiumDetail) {
		this.clubName = clubName;
		this.stadiumId = stadiumId;
		this.latestEplChamp = latestEplChamp;
		this.stadiumDetail = stadiumDetail;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
	}

	public Integer getLatestEplChamp() {
		return latestEplChamp;
	}

	public void setLatestEplChamp(Integer latestEplChamp) {
		this.latestEplChamp = latestEplChamp;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public StadiumDetail getStadiumDetail() {
		return stadiumDetail;
	}

	public void setStadiumDetail(StadiumDetail stadiumDetail) {
		this.stadiumDetail = stadiumDetail;
	}
	
}

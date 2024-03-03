package com.siva.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricket_players")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class PlayerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name = "player_id")
	private int playerId;
	
	@Column(name = "player_name")
	private String playerName;
	
	@Column(name = "player_Age")
	private  Integer playerAge;
	
	private String location;
	
	@Column(name = "palyer_org_name")
	private String playerOrgName;
	@CreationTimestamp
	@Column(name="created_date", updatable=false)
    private LocalDateTime dateCreated;
	@UpdateTimestamp
	@Column(name="updated_date", insertable=false)
    private LocalDateTime dateUpdate;
	
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPlayerOrgName() {
		return playerOrgName;
	}

	public void setPlayerOrgName(String playerOrgName) {
		this.playerOrgName = playerOrgName;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(LocalDateTime dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}

	
	

	

	}

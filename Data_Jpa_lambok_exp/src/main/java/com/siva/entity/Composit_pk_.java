package com.siva.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Composit_pk_ implements Serializable {
	private int playerId;
private int team_id;
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public int getTeam_id() {
	return team_id;
}
public void setTeam_id(int team_id) {
	this.team_id = team_id;
}
	
}

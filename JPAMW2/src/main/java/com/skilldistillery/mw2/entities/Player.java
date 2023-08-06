package com.skilldistillery.mw2.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private String weapon;
	
	@Column(name ="favorite_perk")
	private String favoritePerk;
	
	@Column(name = "operator_skin")
	private String operatorSkin;
	
	private String level;
	
	
	
	public Player() {
		
	}
	
	

	public String getFavoritePerk() {
		return favoritePerk;
	}




	public void setFavoritePerk(String favoritePerk) {
		this.favoritePerk = favoritePerk;
	}




	public String getOperatorSkin() {
		return operatorSkin;
	}




	public void setOperatorSkin(String operatorSkin) {
		this.operatorSkin = operatorSkin;
	}




	public String getLevel() {
		return level;
	}




	public void setLevel(String level) {
		this.level = level;
	}




	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(favoritePerk, id, level, operatorSkin, username, weapon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(favoritePerk, other.favoritePerk) && id == other.id && Objects.equals(level, other.level)
				&& Objects.equals(operatorSkin, other.operatorSkin) && Objects.equals(username, other.username)
				&& Objects.equals(weapon, other.weapon);
	} 

	@Override
	public String toString() {
		return "Player [id=" + id + ", username=" + username + ", weapon=" + weapon + ", favoritePerk=" + favoritePerk
				+ ", operatorSkin=" + operatorSkin + ", level=" + level + "]";
	}
	
	
	
}

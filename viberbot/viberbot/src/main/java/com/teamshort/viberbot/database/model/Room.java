package com.teamshort.viberbot.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	
	@Column(name = "number")
	private String number;
 
	@Column(name = "name")
	private String name;
	
	protected Room() {}

	public Room(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
 

}



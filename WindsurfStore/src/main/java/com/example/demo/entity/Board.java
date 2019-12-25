package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Where;


@Entity
public class Board {
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//autoincrementation
	
	private Long id;
	private String name;
	private String type;
	private Long size;
	@ManyToMany
	@JoinTable(
		name="sails_toUse",
		joinColumns = @JoinColumn(name="board_type"),
		inverseJoinColumns =@JoinColumn(name="sail_type")
		)
	private List<Sail> sails;
	
	public List<Sail> getSails() {
		return sails;
	}
	
	public void setSails(List<Sail> sails) {
		this.sails = sails;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	
	public Long getSize() {
		return size;
	}
	
	public void setSize(Long size) {
		this.size = size;
	}

}

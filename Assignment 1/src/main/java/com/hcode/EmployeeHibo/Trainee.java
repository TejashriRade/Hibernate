package com.hcode.EmployeeHibo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id
	private int ID;
	private String Name;
	private String Technology;
	private int Level;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTechnology() {
		return Technology;
	}
	public void setTechnology(String technology) {
		Technology = technology;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	@Override
	public String toString() {
		return "Trainee [ID=" + ID + ", Name=" + Name + ", Technology=" + Technology + ", Level=" + Level + "]";
	}
	
	
	
	

}

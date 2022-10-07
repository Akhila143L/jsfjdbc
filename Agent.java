package com.infinite.jsfAgent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Agent {
	private int Agentid;
	private String Name;
	private String City;
	private String Gender;
	private int MaritalStatus;
	private double premium;
	@Override
	public String toString() {
		return "Agent [Agentid=" + Agentid + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
				+ ", MaritalStatus=" + MaritalStatus + ", premium=" + premium + "]";
	}
	public Agent(int agentid, String name, String city, String gender, int maritalStatus, double premium) {
		Agentid = agentid;
		Name = name;
		City = city;
		Gender = gender;
		MaritalStatus = maritalStatus;
		this.premium = premium;
	}
	public Agent() {
		// TODO Auto-generated constructor stub
	}
	public int getAgentid() {
		return Agentid;
	}
	public void setAgentid(int agentid) {
		Agentid = agentid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
}

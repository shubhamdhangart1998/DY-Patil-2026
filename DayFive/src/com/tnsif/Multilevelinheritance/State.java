package com.tnsif.Multilevelinheritance;


//child of country
public class State extends Country {

	
	//data members
	private String stateName;
	private String langyage;
	
	//getter and setter 
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLangyage() {
		return langyage;
	}
	public void setLangyage(String langyage) {
		this.langyage = langyage;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", langyage=" + langyage + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
}

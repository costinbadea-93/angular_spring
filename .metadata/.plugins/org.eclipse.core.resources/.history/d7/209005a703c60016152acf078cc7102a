package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Exclusion extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;

	@ManyToOne
	private Breach breaches;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Breach getBreaches() {
		return breaches;
	}

	public void setBreaches(Breach breaches) {
		this.breaches = breaches;
	}
}

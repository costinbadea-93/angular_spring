package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Exclusion extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;

	@OneToMany
	private List<Breach> breaches;

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

	public List<Breach> getBreaches() {
		return breaches;
	}

	public void setBreaches(List<Breach> breaches) {
		this.breaches = breaches;
	}
}

package com.purchase.home.model;

import org.springframework.stereotype.Component;

@Component
public class Persons {
	private int person_id;
	private String person;

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

}

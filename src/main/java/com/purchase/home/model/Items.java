package com.purchase.home.model;

import org.springframework.stereotype.Component;

@Component
public class Items {
	private int id;
	private String item;
	private String status;
	private int need_for;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNeed_for() {
		return need_for;
	}
	public void setNeed_for(int need_for) {
		this.need_for = need_for;
	}

}

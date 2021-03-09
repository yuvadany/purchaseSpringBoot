package com.purchase.home.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="item")
@Table(name = "item")
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="item")
	private String item;
	@Column(name="status")
	private String status;
	@Column(name="needfor")
	private int needFor;
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
	public int getNeedFor() {
		return needFor;
	}
	public void setNeedFor(int needFor) {
		this.needFor = needFor;
	}

}

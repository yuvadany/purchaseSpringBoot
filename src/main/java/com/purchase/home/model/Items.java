package com.purchase.home.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "item")
@Table(name = "item")
public class Items {

	public Items(int id, String item, String status, int needFor) {
		super();
		this.id = id;
		this.item = item;
		this.status = status;
		this.needFor = needFor;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	/*
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "items_seq")
	 * 
	 * @SequenceGenerator(name = "items_seq", sequenceName = "items_seq",
	 * allocationSize = 5)
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "item")
	private String item;
	@Column(name = "status")
	private String status;
	@Column(name = "needfor")
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

	@Override
	public String toString() {
		return "Items [id=" + id + ", item=" + item + ", status=" + status + ", needFor=" + needFor + "]";
	}

}

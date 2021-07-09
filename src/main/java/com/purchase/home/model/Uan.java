package com.purchase.home.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "uan")
public class Uan implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uan_id;

	private String name;
	private String email;

	@OneToMany(mappedBy = "uan", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<PfAccounts> pfAccounts;

	public Uan() {
	}

	public Uan(String name, String email) {
		this.name = name;
		this.email = email;
	}

 

	 

}
package com.purchase.home.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pf_accounts")
public class PfAccounts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pf_id;

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "uan_id", nullable = false)
    private Uan uan;

    public PfAccounts() {
    }

    public PfAccounts(String street, String city, String state, String zipCode,
                   String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

	public Long getId() {
		return pf_id;
	}

	public void setId(Long pf_id) {
		this.pf_id = pf_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Uan getUan() {
		return uan;
	}

	public void setUser(Uan uan) {
		this.uan = uan;
	}

  
}
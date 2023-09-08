package com.icinbank.model;

import java.sql.Date;



import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user") // Specify the table name here
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY for auto-increment
    private Integer id;
    private String fname;
    private String lname;
    private long phone;
    private String address;
    private String email;
    private String username;
    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") // Corrected the date pattern
    private Date dob;

    private String identityType;
    private String identity;

    @Column(columnDefinition = "boolean default false")
    private boolean status;

    @Column(columnDefinition = "boolean default false")
    private boolean authorizationStatus;

    @Column(columnDefinition = "integer default 3", nullable = false)
    private int featureStatus = 3;



	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getAuthorizationStatus() {
		return authorizationStatus;
	}
	public void setAuthorizationStatus(boolean authorizationStatus) {
		this.authorizationStatus = authorizationStatus;
	}
	public int getFeatureStatus() {
		return featureStatus;
	}
	public void setFeatureStatus(int featureStatus) {
		this.featureStatus = featureStatus;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

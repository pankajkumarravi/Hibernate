package org.jspiders.hibernate.onetooneuni.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "aadhar_table")
public class AadharDTO implements Serializable {
	@Id
	@GenericGenerator(name = "pk", strategy = "increment")
	@GeneratedValue(generator = "pk")
	@Column(name = "aadhar_id")
	private long aadharid;
	@Column(name = "aadhar_address")
	private String address;
	@Column(name = "tagline")
	private String tagline;

	@OneToOne
	@JoinColumn(name = "person_id")
	private PersonDTO dto;

	public AadharDTO() {
		System.out.println("default conatructor!!!");
	}

	public long getAadharid() {
		return aadharid;
	}

	public void setAadharid(long aadharid) {
		this.aadharid = aadharid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public PersonDTO getDto() {
		return dto;
	}

	public void setDto(PersonDTO dto) {
		this.dto = dto;
	}

}

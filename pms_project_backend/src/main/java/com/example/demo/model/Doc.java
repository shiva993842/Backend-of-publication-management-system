package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Lob;
import javax.persistence.Table;

//import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="docs")
public class Doc {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String doc_name;
	private String doc_type;
	private String paper_title;
	private String auther_name;
	private String auther_mail;
	private String 	journel_name;
	private String country;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	public String getPaper_title() {
		return paper_title;
	}
	public void setPaper_title(String paper_title) {
		this.paper_title = paper_title;
	}
	public String getAuther_name() {
		return auther_name;
	}
	public void setAuther_name(String auther_name) {
		this.auther_name = auther_name;
	}
	public String getAuther_mail() {
		return auther_mail;
	}
	public void setAuther_mail(String auther_mail) {
		this.auther_mail = auther_mail;
	}
	public String getJournel_name() {
		return journel_name;
	}
	public void setJournel_name(String journel_name) {
		this.journel_name = journel_name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

	

}
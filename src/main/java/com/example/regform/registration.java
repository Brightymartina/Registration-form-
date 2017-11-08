package com.example.regform;

import java.util.List;
import javax.persistence.*;

@Entity
public class registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;

    @Column(name = "fullname")
	private String fullname;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

    @Column(name = "dob")
	private String dob;

    @Column(name = "country")
	private String country;

    @Column(name = "gender")
	private String gender;

    public void setId(int id) {
		this.id = id;
	}
    public int getId() {
		return id;
	}

        public void setFullname(String fullname) {
		this.fullname= fullname;
	}
    public String getFullname() {
		return fullname;
	}
        public void setEmail(String email) {
		this.email = email;
	}
    public String getEmail() {
		return email;
	}
        public void setPassword(String password) {
		this.password= password;
	}
    public String getPassword() {
		return password;
	}
        public void setDob(String dob) {
		this.dob = dob;
	}
    public String getDob() {
		return dob;
	}
        public void setCountry(String country) {
		this.country = country;
	}
    public String getCountry() {
		return country;
	}
        public void setGender(String gender) {
		this.gender = gender;
	}
    public String getGender() {
		return gender;
	}
}
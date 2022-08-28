package io.aadeesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table (name="User")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
		@Column(name = "user_fname", nullable = false)
	private String user_fname;
		@Column(name = "user_lname", nullable = false)
	private String user_lname;
		@Column(name = "user_email", nullable = false)
	private String user_email;
		@Column(name = "user_pass", nullable = false)
	private String user_pass;
		@Column(name = "user_mobile", nullable = false)
	private String user_mobile;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_fname() {
		return user_fname;
	}
	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}
	public String getUser_lname() {
		return user_lname;
	}
	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_mobile() {
		return user_mobile;
	}
	public void setUser_mobile(String user_mobile) {
		this.user_mobile = user_mobile;
	}
	@Override
	public String toString() {
		return "User [id=" + user_id + ", user_fname=" + user_fname + ", user_lname=" + user_lname + ", user_email="
				+ user_email + ", user_pass=" + user_pass + ", user_mobile=" + user_mobile + "]";
	}
	
	
}

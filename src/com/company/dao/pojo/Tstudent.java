package com.company.dao.pojo;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

public class Tstudent implements Serializable {

	private static final long serialVersionUID = 1L;
	private int studentId;
	private String studentName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String birthday;
	private String region;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Tstudent(String studentName, String birthday, String region) {
		super();
		this.studentName = studentName;
		this.birthday = birthday;
		this.region = region;
	}
	public Tstudent() {
		super();
	}
	@Override
	public String toString() {
		return "Tstudent [studentId=" + studentId + ", studentName=" + studentName + ", birthday=" + birthday
				+ ", region=" + region + "]";
	}

	
}

package com.company.service.dto;

import java.io.Serializable;

public class QueryResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int classId;
	private String studentName;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public QueryResult(int classId, String studentName) {
		super();
		this.classId = classId;
		this.studentName = studentName;
	}
	public QueryResult() {
		super();
	}
	@Override
	public String toString() {
		return "QueryResult [classId=" + classId + ", studentName=" + studentName + "]";
	}
	

}

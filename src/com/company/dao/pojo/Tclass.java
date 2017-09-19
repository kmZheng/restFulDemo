package com.company.dao.pojo;

import java.io.Serializable;

public class Tclass implements Serializable {

	private static final long serialVersionUID = 1L;
	private int classId;
	private String className;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	public Tclass(String className) {
		super();
		this.className = className;
	}
	public Tclass() {
		super();
	}
	@Override
	public String toString() {
		return "Tclass [classId=" + classId + ", className=" + className + "]";
	}
	
	
	
}

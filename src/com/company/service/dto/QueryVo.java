package com.company.service.dto;

import java.io.Serializable;

public class QueryVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String className;
	private String region;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public QueryVo(String className, String region) {
		super();
		this.className = className;
		this.region = region;
	}
	public QueryVo() {
		super();
	}
	@Override
	public String toString() {
		return "QueryVo [className=" + className + ", region=" + region + "]";
	}
	
	
	
}

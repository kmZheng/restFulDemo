package com.company.dao.pojo;

import java.io.Serializable;

public class Tscore implements Serializable{

	private static final long serialVersionUID = 1L;

	private int scoreId;
	private int studentId;
	private int classId;
	private int scores;
	public int getScoreId() {
		return scoreId;
	}
	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public Tscore(int scores) {
		super();
		this.scores = scores;
	}
	public Tscore() {
		super();
	}
	@Override
	public String toString() {
		return "Tscore [scoreId=" + scoreId + ", studentId=" + studentId + ", classId=" + classId + ", scores=" + scores
				+ "]";
	}
	
	
}

package com.company.dao.mapper;

import java.util.List;

import com.company.dao.pojo.Tstudent;

public interface TstudentMapper {
	void save(Tstudent student) throws Exception;

	void delete(Tstudent student) throws Exception;

	void update(Tstudent student) throws Exception;

	List<Tstudent> findAll() throws Exception;

	Tstudent findById(int studentId) throws Exception;

	List<Tstudent> findByName(String studentName) throws Exception;
	
	List<Tstudent> findByRegion(String region) throws Exception;
}

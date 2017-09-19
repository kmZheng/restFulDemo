package com.company.dao.mapper;

import java.util.List;

import com.company.dao.pojo.Tclass;

public interface TclassMapper {
	void save(Tclass cla) throws Exception;

	void delete(Tclass cla) throws Exception;

	void update(Tclass cla) throws Exception;

	List<Tclass> findAll() throws Exception;

	Tclass findById(int classId) throws Exception;

	List<Tclass> findByName(String className) throws Exception;
}

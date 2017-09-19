package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Tclass;

public interface ITclassService extends IBaseService<Tclass, Integer> {
	List<Tclass> findByName(String k);
}

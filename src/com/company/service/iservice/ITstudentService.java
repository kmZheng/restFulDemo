package com.company.service.iservice;

import java.util.List;

import com.company.dao.pojo.Tstudent;

public interface ITstudentService extends IBaseService<Tstudent, Integer> {

	List<Tstudent> findByRegion(String region);
}

package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.mapper.TstudentMapper;
import com.company.dao.pojo.Tstudent;
import com.company.service.iservice.ITstudentService;

@Service
public class ServiceTstudentImpl implements ITstudentService {

	@Autowired
	private TstudentMapper studentDao;
	
	@Override
	public String save(Tstudent t) {
		String msg = "error";
		try {
			studentDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String update(Tstudent t) {
		String msg = "error";
		try {
			studentDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String delete(Tstudent t) {
		String msg = "error";
		try {
			studentDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Tstudent> findAll() {
		List<Tstudent> stus = null;
		try {
			stus = studentDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stus;
	}

	@Override
	public Tstudent findById(int k) {
		Tstudent stu = null;
		try {
			stu = studentDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}

	@Override
	public List<Tstudent> findByRegion(String region) {
		List<Tstudent> stus = null;
		try {
			stus = studentDao.findByRegion(region);
			System.out.println(stus);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stus;
	}

}

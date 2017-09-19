package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.mapper.TclassMapper;
import com.company.dao.pojo.Tclass;
import com.company.service.iservice.ITclassService;

@Service
public class ServiceTclassImpl implements ITclassService {

	@Autowired
	private TclassMapper classDao;
	
	@Override
	public String save(Tclass t) {
		String msg = "error";
		try {
			classDao.save(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String update(Tclass t) {
		String msg = "error";
		try {
			classDao.update(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String delete(Tclass t) {
		String msg = "error";
		try {
			classDao.delete(t);
			msg = "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public List<Tclass> findAll() {
		List<Tclass> clas = null;
		try {
			clas = classDao.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clas;
	}

	@Override
	public Tclass findById(int k) {
		Tclass cla = null;
		try {
			cla = classDao.findById(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cla;
	}

	@Override
	public List<Tclass> findByName(String k) {
		List<Tclass> clas = null;
		try {
			clas = classDao.findByName(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clas;
	}

	
}

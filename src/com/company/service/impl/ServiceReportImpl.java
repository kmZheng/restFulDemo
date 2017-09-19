package com.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.mapper.ReportMapper;
import com.company.service.dto.QueryResult;
import com.company.service.dto.QueryVo;
import com.company.service.iservice.IReportService;

@Service
public class ServiceReportImpl implements IReportService {
	
	@Autowired
	private ReportMapper reportDao;
	
	@Override
	public List<QueryResult> findByQuery(QueryVo vo) {
		List<QueryResult> results = null;
		try {
			results = reportDao.findByQuery(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return results;
	}

}

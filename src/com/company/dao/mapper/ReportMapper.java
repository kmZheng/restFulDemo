package com.company.dao.mapper;

import java.util.List;

import com.company.service.dto.QueryResult;
import com.company.service.dto.QueryVo;

public interface ReportMapper {
	
	List<QueryResult> findByQuery(QueryVo vo) throws Exception;
}

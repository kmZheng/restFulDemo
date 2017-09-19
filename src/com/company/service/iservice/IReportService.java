package com.company.service.iservice;

import java.util.List;

import com.company.service.dto.QueryResult;
import com.company.service.dto.QueryVo;

public interface IReportService {

	List<QueryResult> findByQuery(QueryVo vo);
}

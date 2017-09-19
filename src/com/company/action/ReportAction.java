package com.company.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.service.dto.QueryResult;
import com.company.service.dto.QueryVo;
import com.company.service.iservice.IReportService;

@Controller
@RequestMapping("report")
public class ReportAction {

	@Autowired
	private IReportService reportService;
	
	@RequestMapping("init")
	public String queryinit() {
		return "Query";
	}
	
	@RequestMapping(value="rep/{className}/{region}",method=RequestMethod.POST)
	public String findByQuery(@PathVariable("vo") QueryVo vo,Map<String,Object> map){
		List<QueryResult> res = reportService.findByQuery(vo);
		if(res != null && res.size() > 0 ){
			map.put("QueryListFromServer", res);
			return "Query_findAll";
		}else{
			return "error";
		}
	}
}

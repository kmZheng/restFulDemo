package com.company.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.pojo.Tclass;
import com.company.service.iservice.ITclassService;

@Controller
@RequestMapping("tclass")
public class TclassAction {

	@Autowired
	private ITclassService classService;
	
	@RequestMapping("saveinit")
	public String saveinit() {
		return "tclass_save";
	}
	
	@RequestMapping(value="cla",method=RequestMethod.POST)
	public String save(@ModelAttribute Tclass tclass){
		String msg = classService.save(tclass); 
		return "success".equals(msg) ? "redirect:clas" : "error";
	}
	
	
	@RequestMapping(value="cla/{classId}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("classId") int classId){
		Tclass tcla = new Tclass();
		tcla.setClassId(classId);		
		String msg = classService.delete(tcla); 
		return "success".equals(msg) ? "redirect:clas" : "error";
	}
	
	@RequestMapping(value="cla/{classId}",method=RequestMethod.GET)
	public String updateGet(@PathVariable("classId") int classId,Map<String, Object> model){
		Tclass tcla = classService.findById(classId);
		if(tcla != null){
			model.put("TclassFromServer",tcla);
			return "tclass_update";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="cla",method=RequestMethod.PUT)
	public String update(@ModelAttribute Tclass tclass){
		String msg = classService.update(tclass); 
		return "success".equals(msg) ? "redirect:clas" : "error";
	}
	
	
	@RequestMapping(value="clas",method=RequestMethod.GET)
	public String findAll(Map<String, Object> model){
		List<Tclass> tclas = classService.findAll();  
		if(tclas != null && tclas.size() > 0 ){
			model.put("TclassListFromServer",tclas);
			return "tclass_findAll";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="cla/{classId}")
	public String findById(@PathVariable("classId") int classId,Map<String, Object> model){
		Tclass tcla = classService.findById(classId);
		if(tcla != null){
			List<Tclass> tclas = new ArrayList<>();
			tclas.add(tcla);
			model.put("TclassListFromServer",tclas);
			return "tclass_findAll";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="findbyname",method=RequestMethod.POST)
	public String findByName(String className,Map<String, Object> model){
		List<Tclass> tclas = classService.findByName(className);  
		if(tclas != null && tclas.size() > 0 ){
			model.put("TclassListFromServer",tclas);
			return "tclass_findAll";
		}else{
			return "error";
		}
	}
	
}

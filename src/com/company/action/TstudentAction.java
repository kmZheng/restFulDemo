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

import com.company.dao.pojo.Tstudent;
import com.company.service.iservice.ITstudentService;

@Controller
@RequestMapping("tstudent")
public class TstudentAction {

	@Autowired
	private ITstudentService studentService;
	
	@RequestMapping("saveinit")
	public String saveinit() {
		return "tstudent_save";
	}
	
	@RequestMapping(value="stu",method=RequestMethod.POST)
	public String save(@ModelAttribute Tstudent tstudent){
		String msg = studentService.save(tstudent); 
		return "success".equals(msg) ? "redirect:stus" : "error";
	}
	
	
	@RequestMapping(value="stu/{studentId}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("studentId") int studentId){
		Tstudent tstu = new Tstudent();
		tstu.setStudentId(studentId);	
		String msg = studentService.delete(tstu); 
		return "success".equals(msg) ? "redirect:stus" : "error";
	}
	
	@RequestMapping(value="stu/{studentId}",method=RequestMethod.GET)
	public String updateGet(@PathVariable("studentId") int studentId,Map<String, Object> model){
		Tstudent tstu = studentService.findById(studentId);
		if(tstu != null){
			model.put("TstudentFromServer",tstu);
			return "tstudent_update";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="stu",method=RequestMethod.PUT)
	public String update(@ModelAttribute Tstudent tstudent){
		String msg = studentService.update(tstudent); 
		return "success".equals(msg) ? "redirect:stus" : "error";
	}
	
	
	@RequestMapping(value="stus",method=RequestMethod.GET)
	public String findAll(Map<String, Object> model){
		List<Tstudent> tstus = studentService.findAll();  
		if(tstus != null && tstus.size() > 0 ){
			model.put("TstudentListFromServer",tstus);
			return "tstudent_findAll";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="stu/{studentId}")
	public String findById(@PathVariable("studentId") int studentId,Map<String, Object> model){
		Tstudent tstu = studentService.findById(studentId);
		if(tstu != null){
			List<Tstudent> tstus = new ArrayList<>();
			tstus.add(tstu);
			model.put("TstudentListFromServer",tstus);
			return "tstudent_findAll";
		}else{
			return "error";
		}
	}
	
	@RequestMapping(value="findbyregion",method=RequestMethod.POST)
	public String findByRegion(String region,Map<String, Object> model){
		List<Tstudent> tstus = studentService.findByRegion(region);  
		if(tstus != null && tstus.size() > 0 ){
			model.put("TstudentListFromServer",tstus);
			return "tstudent_findAll";
		}else{
			return "error";
		}
	}
}

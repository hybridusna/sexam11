package webapp.controller;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.model.Dept;
import webapp.model.Emp;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	static Log log = LogFactory.getLog(DeptController.class);
	
//	@Autowired
	Calendar calendar;
	
	@RequestMapping("/calendar")
	public void getCalendar(){
		log.info("#################");
		log.info("getCalendar");
		log.info("#################");
		log.info(calendar.getTime().toLocaleString());
		
	}
	
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getMessage(){
		
		return "dept/message";
	}
	
	@RequestMapping(value="/registertest", method=RequestMethod.GET)
	public String getResisterTest(Integer deptno, String dname, String loc){

		return "dept/registerform";
	}
	
	public String registerDept(){
		
		return "dept/resister";
	}

	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getResister1(Integer deptno, String dname, String loc){
		log.info("deptno = " + deptno);
		log.info("danme = " + dname);
		log.info("loc = " + loc);
		
		return "dept/registerform";
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.GET)
	public String getResister2(HttpServletRequest request, HttpServletResponse response){
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		log.info("deptno = " + deptno);
		log.info("dname = " + dname);
		log.info("loc = " + loc);
		
		return "dept/registerform";
	}
	
	@RequestMapping(value="/test3", method=RequestMethod.GET)
	public String getResister3(Dept dept){
		log.info("deptno = " + dept.getDeptno());
		log.info("danme = " + dept.getDname());
		log.info("loc = " + dept.getLoc());
		
		List<Emp> emps = dept.getEmps();
		for(int i =0;i<emps.size();i++){
			log.info("dept.emps.empno = " +i +"empno = " + emps.get(i).getEmpno());
			log.info("dept.emps.ename = "  +i +"empno = " + emps.get(i).getEname());
		}
		
		return "dept/registerform";
	}
}

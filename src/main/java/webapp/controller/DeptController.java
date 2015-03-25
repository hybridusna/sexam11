package webapp.controller;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;

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
	
	@Autowired
	LocaleResolver lr;
	
	@RequestMapping(value="/locale", method=RequestMethod.GET)
	public void changeLocale(String language, PrintWriter out, HttpServletRequest request, HttpServletResponse response){
		log.info("language = " +  language);
		Locale l = new Locale(language);
		lr.setLocale(request, response, l);
		
		out.println("<h1>language = " + language+"</h1>");
	}
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getMessage(){
		
		return "dept/message";
	}

}

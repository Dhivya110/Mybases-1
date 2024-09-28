package com.mybases;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller
public class IndexControll {

		 @RequestMapping("NewFile")
		 
		public  ModelAndView newFile (userDetails ud)  
				               
		{
			 /*
			 
            HttpSession session = request .getSession();  //2 
			String s = request.getParameter("name");   //1
			
			*/ 
			 
			 
			 ModelAndView mav = new ModelAndView();
			 mav.addObject("details" , ud); 
			 mav.setViewName("NewFile");
			 			 			
			// session.setAttribute("username", firstName);   //----> data  // model 
			
			
			
			// session.setAttribute("password", Password);
			
			
			return mav;    // view
 
		}

	}

	


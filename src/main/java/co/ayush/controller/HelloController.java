package co.ayush.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.ayush.model.Student;

@Controller
public class HelloController {
	/*
	 * @RequestMapping("/hello") public ModelAndView sayHello() { ModelAndView mv=new
	 * ModelAndView(); mv.setViewName("welcome"); return mv; }
	 */
	
	/*@RequestMapping("/hello")
	public String display(HttpServletRequest request,Model m) {
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");	
		
		if(pass.equals("admin"))
		{
			String msg = "Hello " + user;
			m.addAttribute("message",msg);
			return "viewpage";
		}
		else
		{
			String msg="Sorry " + user + ".You entered an incorrect password";
			m.addAttribute("message", msg);
			return "errorpage";
		}*/
	
	/*
	 * @RequestMapping("/hello") public String display(@RequestParam String
	 * user,@RequestParam String pass,Model m) {
	 * 
	 * 
	 * Student st=new Student(); st.setStname(user); st.setStpass(pass);
	 * 
	 * m.addAttribute("message", st); return "viewpage";
	 * 
	 * 
	 * }
	 */
	
	/*
	 * @RequestMapping("/hello") public String display(@RequestParam String
	 * user,@RequestParam String pass,Model m) {
	 * 
	 * if(pass.equals("admin")) { String msg = "Hello " + user;
	 * m.addAttribute("message",msg); return "viewpage"; } else { String
	 * msg="Sorry " + user + ".You entered an incorrect password";
	 * m.addAttribute("message", msg); return "errorpage"; } }
	 */
	
	/*
	 * @RequestMapping("/hello") public String display(@RequestParam String
	 * user,@RequestParam String pass,Model m) {
	 * 
	 * Student st=new Student(); st.setStname(user); st.setStpass(pass);
	 * 
	 * m.addAttribute("message", st); return "viewpage"; }
	 */
	
	@RequestMapping("/hello")
	public String display(@ModelAttribute("message") Student st) {
	
		return "viewpage";
		}	
}


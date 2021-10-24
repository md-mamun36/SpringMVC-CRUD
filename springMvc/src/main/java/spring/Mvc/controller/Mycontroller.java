package spring.Mvc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import spring.Mvc.model.User;
import spring.Mvc.service.UserService;

@Controller
public class Mycontroller {

	@Autowired
	private UserService userServic;

	@ModelAttribute
	public void commn(Model m) {
		m.addAttribute("head", "Mvc CRUD Application");

	}

	@RequestMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("name", "md al Mamun");
		List<Integer> id = new ArrayList<Integer>();
		id.add(201);
		id.add(202);
		id.add(203);
		model.addAttribute("ids", id);
		return "contact";
	}

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mod = new ModelAndView();
		mod.setViewName("home");
		List<String> name = new ArrayList<String>();
		name.add("harun");
		name.add("Rahim");
		name.add("Karim");
		mod.addObject("emp", name);
		return mod;
	}

	@RequestMapping("/registration")
	public String regis() {

		return "registration";
	}

	// to recive and send data from view to controler

	@RequestMapping("/myForm")
	public String process(@ModelAttribute User user, Model m) {
	
	this.userServic.createUser(user);

		
		return "redirect:/success";
	}

	@RequestMapping("/success")
	public String success(@ModelAttribute User user, Model m) {
		List<User> alluser = this.userServic.getAlluser();

		m.addAttribute("all", alluser);
		return "success";
	}

	@RequestMapping("/deletuser")
	public String deluser(HttpServletRequest req, Model m) {
		int paraid = (Integer.parseInt(req.getParameter("id")));
		
		this.userServic.delete(paraid);
	
		
		return "redirect:/success";
	}
	
	@RequestMapping("/editEmployee")
	public String edetuser(HttpServletRequest req, Model m) {
		int paraid = (Integer.parseInt(req.getParameter("id")));
	
		User getuser = this.userServic.getuser(paraid);
		m.addAttribute("muser", getuser);

		return "updateForm";
	}
	@RequestMapping("")
	public String myindex() {
		return "redirect:/success";
	}
	
	
	//to grnarate report
	@RequestMapping("/report")
	public String jsReport() throws JRException {
		List<User> alluser = this.userServic.getAlluser();
		try {
			Map <String , Object> param=new HashMap<String , Object>();
			param.put("Parameters", "Md. Al Mamun");
			File f=ResourceUtils.getFile("classpath:Simple_Blue.jrxml");
			JRBeanCollectionDataSource jrben=new JRBeanCollectionDataSource(alluser);
			JasperReport compileReport = JasperCompileManager.compileReport(f.getAbsolutePath());
			JasperPrint fillReport = JasperFillManager.fillReport(compileReport, param,jrben);
			JasperExportManager.exportReportToPdfFile(fillReport, "C:\\Users\\mdmam\\OneDrive\\Desktop\\jsReport\\AllItem.pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return"redirect:/success";
	}
}

////to recive data from view
//	@RequestMapping(path = "/myForm", method = RequestMethod.POST)
//	public String process(@RequestParam("userName")String name,
//			@RequestParam("email")String email,
//			@RequestParam("password")String password,Model mod){
//		
//		
//		//send  data to view
//		mod.addAttribute("name",name);
//		mod.addAttribute("email",email);
//		mod.addAttribute("pass",password);
//		return "success";
//	}
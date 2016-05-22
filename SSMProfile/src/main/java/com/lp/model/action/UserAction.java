package com.lp.model.action;


import java.util.List;
import java.util.Map;









import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lp.model.entity.Profile;
import com.lp.model.service.ProfileService;
import com.opensymphony.xwork2.ModelDriven;



@Controller("UserAction")
public class UserAction implements ModelDriven<Profile>,SessionAware{

	private Map<String, Object> session;
	
	private Profile profile;
	
	@Autowired
	private ProfileService profileService;
	
	
	
	public String Result() {
		List<Profile> p=profileService.findAll();
		session.put("list", p);
		
		return "Result";
	}
	
	public String Show(){
		int id=Integer.valueOf(ServletActionContext.getRequest().getParameter("id"));
		Profile pro=profileService.findProfile(id);
		session.put("pro", pro);
		return "Show";
	}

	public String Update(){
		int id=Integer.valueOf(ServletActionContext.getRequest().getParameter("id"));
		Profile pro=profileService.findProfile(id);
		session.put("pro", pro);
		return "Update";
	}
	
	public String UptPro(){
		

		
		System.out.println(profile);
		
		
		int result=profileService.updateProfile(profile);
		if(result>0){
			Result();
			return "Suces";
		}else{
			return "Fail";
		}
	
		
		
	}
	
	

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	@Override
	public Profile getModel() {
		profile=new Profile();
		return profile;
	}
}

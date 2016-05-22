package com.lp.cinema.action;

import java.util.List;
import java.util.Map;
import java.util.logging.LogManager;

import org.apache.struts2.interceptor.SessionAware;

import com.lp.cinema.entity.FilmBean;
import com.lp.cinema.entity.FilmInfo;
import com.lp.cinema.service.FilmService;
import com.lp.cinema.serviceimpl.FilmServiceImpl;
import com.opensymphony.xwork2.ModelDriven;

public class AddFilmAction implements ModelDriven<FilmInfo>,SessionAware{
	private FilmService filmService;
	private FilmInfo filmInfo;
	private Map<String,Object> session;
	
	public AddFilmAction(){
			filmService=new FilmServiceImpl();
	}
	
	public String add(){
		System.out.println(filmInfo+"-----------------------");
		int result=filmService.addFilm(filmInfo);
		if(result>0){
			reflash();
			return "success";
		}else{
			System.out.println("``````````````````````ÃÌº” ß∞‹");
			return "none";
		}
		
	}
	
	public void reflash(){
			List<FilmInfo> films=filmService.getFilmsByFilmBean(null);
			session.put("films", films);
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	@Override
	public FilmInfo getModel() {
		filmInfo=new FilmInfo();
		return filmInfo;
	}
	
}

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

public class FilmAction implements ModelDriven<FilmBean>,SessionAware{
	private FilmService filmService;
	private FilmBean filmBean;
	private Map<String,Object> session;
	
	public FilmAction(){
			filmService=new FilmServiceImpl();
	}
	public String search(){
		System.out.println(filmBean);
		List<FilmInfo> films=filmService.getFilmsByFilmBean(filmBean);
		session.put("films", films);
		return "success";
	}
	public String add(){
		
		return "addFilm";
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	@Override
	public FilmBean getModel() {
		filmBean=new FilmBean();
		return filmBean;
	}
	
}

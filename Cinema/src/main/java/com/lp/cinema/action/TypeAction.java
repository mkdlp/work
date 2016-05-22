package com.lp.cinema.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.lp.cinema.entity.FilmType;
import com.lp.cinema.service.TypeService;
import com.lp.cinema.serviceimpl.TypeServiceImpl;

public class TypeAction {
	private TypeService typeService;
	private List<FilmType> filmTypes;
	
	public List<FilmType> getFilmTypes(){
		return filmTypes;
	}
	
	public TypeAction(){
		typeService=new TypeServiceImpl();
	}
	
	
	//ֱ�����첽��Ӧ������Ҫ����ҳ����ת�����Է�������û��void
//	public void getTypes(){
//		HttpServletResponse response=ServletActionContext.getResponse();
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("charset=utf-8");
//		
//		try {
//			List<FilmType> types=typeService.findAllType();
//			Gson gson=new Gson();
//			String jsonResult=gson.toJson(types);
//			PrintWriter out=response.getWriter();
//			//out.print("{\"msg\":\"�Ҹ����ˣ�������\"}");
//			out.print(jsonResult);
//			out.flush();
//			out.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public String getTypes(){
		filmTypes=typeService.findAllType();
		return "success";
	}
	
}

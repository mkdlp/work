package com.lp.cinema.serviceimpl;

import java.util.List;

import com.lp.cinema.entity.FilmType;
import com.lp.cinema.mapper.FilmTypeMapper;
import com.lp.cinema.service.TypeService;
import com.lp.cinema.util.MyBatisUtil;

public class TypeServiceImpl implements TypeService {
	private FilmTypeMapper filmTypeMapper;
	
	public TypeServiceImpl(){
		filmTypeMapper=MyBatisUtil.getSession(true).getMapper(FilmTypeMapper.class);
	}
	
	
	public List<FilmType> findAllType() {
		return filmTypeMapper.findAllType();
	}

}

package com.lp.cinema.serviceimpl;

import java.util.List;

import com.lp.cinema.entity.FilmBean;
import com.lp.cinema.entity.FilmInfo;
import com.lp.cinema.mapper.FilmInfoMapper;
import com.lp.cinema.service.FilmService;
import com.lp.cinema.util.MyBatisUtil;

public class FilmServiceImpl implements FilmService {
	private FilmInfoMapper filmInfoMapper;
	
	public FilmServiceImpl(){
		filmInfoMapper =MyBatisUtil.getSession(true).getMapper(FilmInfoMapper.class);
	}

	@Override
	public List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean) {
		return filmInfoMapper.getFilmsByFilmBean(filmBean);
	}

	@Override
	public int addFilm(FilmInfo film) {
		return filmInfoMapper.addFilm(film);
	}
	

}

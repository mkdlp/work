package com.lp.cinema.service;

import java.util.List;

import com.lp.cinema.entity.FilmBean;
import com.lp.cinema.entity.FilmInfo;

public interface FilmService {
	List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean);
	int addFilm(FilmInfo film);
}

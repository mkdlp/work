package com.lp.cinema.service;

import java.util.List;

import com.lp.cinema.entity.FilmInfo;
import com.lp.cinema.entity.FilmType;

public interface TypeService {
	List<FilmType> findAllType();
}

package com.lp.cinema.mapper;


import java.util.List;

import com.lp.cinema.entity.FilmBean;
import com.lp.cinema.entity.FilmInfo;

public interface FilmInfoMapper {
    List<FilmInfo> getFilmsByFilmBean(FilmBean filmBean);
    int addFilm(FilmInfo film);
}
package com.lp.model.mapper;

import java.util.List;

import com.lp.model.entity.Profile;


public interface ProfileMapper {
	List<Profile> findAll();
	Profile findProfile(int id);
	int updateProfile(Profile pro);
}

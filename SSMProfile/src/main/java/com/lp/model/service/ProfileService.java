package com.lp.model.service;

import java.util.List;

import com.lp.model.entity.Profile;

public interface ProfileService {
	List<Profile> findAll();
	Profile findProfile(int id);
	int updateProfile(Profile pro);
}

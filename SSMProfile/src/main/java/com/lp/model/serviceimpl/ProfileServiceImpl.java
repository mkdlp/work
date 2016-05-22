package com.lp.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.model.entity.Profile;
import com.lp.model.mapper.ProfileMapper;
import com.lp.model.service.ProfileService;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileMapper profileMapper;
	
	@Override
	public List<Profile> findAll() {
		return profileMapper.findAll();
	}

	@Override
	public Profile findProfile(int id) {
		return profileMapper.findProfile(id);
	}

	@Override
	public int updateProfile(Profile pro) {
		return profileMapper.updateProfile(pro);
	}

}

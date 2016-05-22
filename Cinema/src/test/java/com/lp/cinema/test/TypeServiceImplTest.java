package com.lp.cinema.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.lp.cinema.entity.FilmType;
import com.lp.cinema.service.TypeService;
import com.lp.cinema.serviceimpl.TypeServiceImpl;

public class TypeServiceImplTest {
	@Test
	public void testFindAllTypes(){
		TypeService ts=new TypeServiceImpl();
		List<FilmType> types=ts.findAllType();
		System.out.println(types);
		assertNotNull(types);
		
	}
}

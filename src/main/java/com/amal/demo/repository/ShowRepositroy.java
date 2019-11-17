package com.amal.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amal.demo.models.TvShows;

@Repository
public interface ShowRepositroy extends CrudRepository<TvShows, Long>{ 
	List<TvShows> findAll();
	

	
}

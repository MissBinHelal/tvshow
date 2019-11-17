package com.amal.demo.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.amal.demo.models.TvShows;
import com.amal.demo.repository.ShowRepositroy;

@Service
public class ShowsService {
private final ShowRepositroy showRepositroy;

public ShowsService(ShowRepositroy showRepositroy) {
	this.showRepositroy = showRepositroy;
}
public List<TvShows> allTvShow(){
	return showRepositroy.findAll();
}

public TvShows createshow(TvShows s) {
	 return showRepositroy.save(s);
}
public TvShows updateshow(TvShows s) {
	 return showRepositroy.save(s);
}
public void deleteShow(Long id ) {
	  showRepositroy.deleteById(id);
}
public TvShows findShow(Long id) {
	Optional<TvShows> optionalTvShows = showRepositroy.findById(id);
    if(optionalTvShows.isPresent()) {
        return optionalTvShows.get();
    } else {
        return null;
    }
}
public @Valid TvShows updateShow(@Valid TvShows tvshows) {
	Optional<TvShows> optionalShow = showRepositroy.findById(tvshows.getId());
	System.out.print("id is "+optionalShow);
	  if(optionalShow.isPresent()) {
		  TvShows optionalShow1 = optionalShow.get();
		  optionalShow1.setTitle(tvshows.getTitle());
		  optionalShow1.setDescription(tvshows.getDescription());
		  optionalShow1.setLanguage(tvshows.getLanguage());
		  return showRepositroy.save(optionalShow1);   
        } else {
            return null;
        }
}
}

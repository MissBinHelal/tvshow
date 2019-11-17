package com.amal.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amal.demo.models.TvShows;
import com.amal.demo.services.ShowsService;;

@Controller
public class ShowController {
private final ShowsService showsService ;

public ShowController(ShowsService showService) {
	this.showsService = showService;
}
@RequestMapping("/show")
public String TvShows(Model model){
	List<TvShows> tvshows = showsService.allTvShow();
	model.addAttribute("tvshows",tvshows);
	return "/Show/shows.jsp";
	
}
@RequestMapping(value="/show/new", method=RequestMethod.GET)
public String createShow(@Valid @ModelAttribute("show") TvShows tvshow) {
    	return "/Show/addShow.jsp";
  
}

@RequestMapping(value="/show/new", method=RequestMethod.POST)
public String createShow(@Valid @ModelAttribute("show") TvShows tvshow, BindingResult result) {
    if (result.hasErrors()) {
    	System.out.println("error");
        return "Error";
    } else {
    	showsService.createshow(tvshow);
    	System.out.println("Done");
    	return "redirect:/show";
    }
}

@RequestMapping("/show/{id}")
public String show(@PathVariable(value = "id") Long Id, Model model) {    
TvShows tvshow = showsService.findShow(Id);
model.addAttribute("tvshow", tvshow);
return "Show/show.jsp";
}
@RequestMapping("/show/edit/{id}")
	public String edit(@PathVariable(value = "id") Long Id, Model model) {    
	TvShows tvshow = showsService.findShow(Id);
	model.addAttribute("tvshow", tvshow);
return "Show/editshow.jsp";
}
@RequestMapping(value="/show/{id}", method=RequestMethod.PUT)
public String update(@Valid @ModelAttribute("show") TvShows tvshow, BindingResult result) {
    if (result.hasErrors()) {
        return "Show/editshow.jsp";
    } else {
    	showsService.updateShow(tvshow);
        return "redirect:/show";
    }
}

@RequestMapping(value="/show/{id}/delete")
public String destroy(@PathVariable("id") Long id) {
	showsService.deleteShow(id);
	System.out.println("done");
    return "redirect:/show";
}
}
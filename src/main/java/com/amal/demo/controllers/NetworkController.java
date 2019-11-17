package com.amal.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amal.demo.models.Network;
import com.amal.demo.services.NetworkService;

@Controller
public class NetworkController {
private final NetworkService networkService ;

public NetworkController(NetworkService networkService) {
	this.networkService = networkService;
}
@RequestMapping("/network")
public String network(@ModelAttribute("network") Network network){
	return "/Network/network.jsp";
	
}
@RequestMapping(value="/Network/new", method=RequestMethod.POST)
public String createNetwork(@Valid @ModelAttribute("network") Network network, BindingResult result) {
    if (result.hasErrors()) {
    	System.out.print("error");
        return "Error";
    } else {
    	networkService.createnetwork(network);
    	System.out.print("Done");
        return "/Network/network.jsp";
    }
}


}

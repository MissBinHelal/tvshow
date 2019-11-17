package com.amal.demo.services;

import org.springframework.stereotype.Service;

import com.amal.demo.models.Network;
import com.amal.demo.repository.networkRepositroy;

@Service

public class NetworkService {
	 private final networkRepositroy networkRepository ;

	public NetworkService(networkRepositroy networkRepository) {
		this.networkRepository = networkRepository;
	}
	 public Network createnetwork(Network n) {
		 return networkRepository.save(n);
	 }
}

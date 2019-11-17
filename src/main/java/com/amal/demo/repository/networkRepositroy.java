package com.amal.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amal.demo.models.Network;

@Repository

public interface networkRepositroy extends CrudRepository<Network, Long>{
List<Network> findAll();
}

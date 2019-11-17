package com.amal.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="network")
public class Network {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Size(min = 5, max = 100)
	    private String name;
	    @OneToMany(mappedBy="network", fetch = FetchType.LAZY)
	    private List<TvShows> shows;
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	    
}

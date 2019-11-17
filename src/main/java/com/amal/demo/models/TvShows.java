package com.amal.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="shows")
public class TvShows {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Size(min = 3, max = 200)
	    @Column(unique=true)
	    private String title;
	    @Size(min = 10, max = 200)
	    private String description;
	    @Size(min = 5, max = 40)
	    private String language;
	    @Size(min = 3, max = 40)
	    private String network;
	    
		public TvShows() {
		}
		public TvShows(Long id, @Size(min = 3, max = 200) String title, @Size(min = 10, max = 200) String description,
				@Size(min = 5, max = 40) String language, @Size(min = 3, max = 40) String network) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.language = language;
			this.network = network;
		}
		public String getNetwork() {
			return network;
		}
		public void setNetwork(String network) {
			this.network = network;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
	    
}


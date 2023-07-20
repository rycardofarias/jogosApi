package com.example.jogosApi.dto;

import com.example.jogosApi.entities.Game;

public class GameDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private String imgUrl;
	private Double score;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.genre = entity.getGenre();
		this.platforms = entity.getPlatforms();
		this.imgUrl = entity.getImgUrl();
		this.score = entity.getScore();
		this.shortDescription = entity.getShortDescription();
		this.longDescription = entity.getLongDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public Double getScore() {
		return score;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
	
}
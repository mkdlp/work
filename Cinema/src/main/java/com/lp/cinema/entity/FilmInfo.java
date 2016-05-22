package com.lp.cinema.entity;

import java.math.BigDecimal;

public class FilmInfo {
    private Integer filmid;

    private String filmname;

    private FilmType type;

    private String actor;

    private String director;

    private BigDecimal ticketprice;

    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname == null ? null : filmname.trim();
    }

    public FilmType getType() {
		return type;
	}

	public void setType(FilmType type) {
		this.type = type;
	}
//    public String getTypeid(){
//    	return String.valueOf(type.getTypeid());
//    }
//    public void setTypeid(String typeid){
//    	this.type.setTypeid(Integer.valueOf(typeid));
//    }
	
	

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public BigDecimal getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(BigDecimal ticketprice) {
        this.ticketprice = ticketprice;
    }

	@Override
	public String toString() {
		return "FilmInfo [filmid=" + filmid + ", filmname=" + filmname
				+ ", type=" + type + ", actor=" + actor + ", director="
				+ director + ", ticketprice=" + ticketprice + "]";
	}

}
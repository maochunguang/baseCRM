package com.koowo.entity.paycenter;

import java.util.Date;

public class CasualGameStat{
	private Long id;
	private String game;
	private Long useTotalPeople;
	private Long useTotalCash;
	private Long addTotalPeople;
	private Long addTotalCash;
	private Date date;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getGame(){
		return game;
	}

	public void setGame(String game){
		this.game = game;
	}

	public Long getUseTotalPeople(){
		return useTotalPeople;
	}

	public void setUseTotalPeople(Long useTotalPeople){
		this.useTotalPeople = useTotalPeople;
	}

	public Long getUseTotalCash(){
		return useTotalCash;
	}

	public void setUseTotalCash(Long useTotalCash){
		this.useTotalCash = useTotalCash;
	}

	public Long getAddTotalPeople(){
		return addTotalPeople;
	}

	public void setAddTotalPeople(Long addTotalPeople){
		this.addTotalPeople = addTotalPeople;
	}

	public Long getAddTotalCash(){
		return addTotalCash;
	}

	public void setAddTotalCash(Long addTotalCash){
		this.addTotalCash = addTotalCash;
	}

	public Date getDate(){
		return date;
	}

	public void setDate(Date date){
		this.date = date;
	}
}

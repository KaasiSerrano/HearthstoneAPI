package com.example.hearthstoneapi.retrofit.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Cards{

	@SerializedName("img")
	private String img;

	@SerializedName("cost")
	private int cost;

	@SerializedName("collectible")
	private boolean collectible;

	@SerializedName("artist")
	private String artist;

	@SerializedName("mechanics")
	private List<MechanicsItem> mechanics;

	@SerializedName("dbfId")
	private String dbfId;

	@SerializedName("type")
	private String type;

	@SerializedName("locale")
	private String locale;

	@SerializedName("flavor")
	private String flavor;

	@SerializedName("playerClass")
	private String playerClass;

	@SerializedName("cardSet")
	private String cardSet;

	@SerializedName("cardId")
	private String cardId;

	@SerializedName("name")
	private String name;

	@SerializedName("imgGold")
	private String imgGold;

	@SerializedName("text")
	private String text;

	@SerializedName("rarity")
	private String rarity;

	public void setImg(String img){
		this.img = img;
	}

	public String getImg(){
		return img;
	}

	public void setCost(int cost){
		this.cost = cost;
	}

	public int getCost(){
		return cost;
	}

	public void setCollectible(boolean collectible){
		this.collectible = collectible;
	}

	public boolean isCollectible(){
		return collectible;
	}

	public void setArtist(String artist){
		this.artist = artist;
	}

	public String getArtist(){
		return artist;
	}

	public void setMechanics(List<MechanicsItem> mechanics){
		this.mechanics = mechanics;
	}

	public List<MechanicsItem> getMechanics(){
		return mechanics;
	}

	public void setDbfId(String dbfId){
		this.dbfId = dbfId;
	}

	public String getDbfId(){
		return dbfId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setFlavor(String flavor){
		this.flavor = flavor;
	}

	public String getFlavor(){
		return flavor;
	}

	public void setPlayerClass(String playerClass){
		this.playerClass = playerClass;
	}

	public String getPlayerClass(){
		return playerClass;
	}

	public void setCardSet(String cardSet){
		this.cardSet = cardSet;
	}

	public String getCardSet(){
		return cardSet;
	}

	public void setCardId(String cardId){
		this.cardId = cardId;
	}

	public String getCardId(){
		return cardId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setImgGold(String imgGold){
		this.imgGold = imgGold;
	}

	public String getImgGold(){
		return imgGold;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setRarity(String rarity){
		this.rarity = rarity;
	}

	public String getRarity(){
		return rarity;
	}

	@Override
 	public String toString(){
		return 
			"Cards{" + 
			"img = '" + img + '\'' + 
			",cost = '" + cost + '\'' + 
			",collectible = '" + collectible + '\'' + 
			",artist = '" + artist + '\'' + 
			",mechanics = '" + mechanics + '\'' + 
			",dbfId = '" + dbfId + '\'' + 
			",type = '" + type + '\'' + 
			",locale = '" + locale + '\'' + 
			",flavor = '" + flavor + '\'' + 
			",playerClass = '" + playerClass + '\'' + 
			",cardSet = '" + cardSet + '\'' + 
			",cardId = '" + cardId + '\'' + 
			",name = '" + name + '\'' + 
			",imgGold = '" + imgGold + '\'' + 
			",text = '" + text + '\'' + 
			",rarity = '" + rarity + '\'' + 
			"}";
		}
}
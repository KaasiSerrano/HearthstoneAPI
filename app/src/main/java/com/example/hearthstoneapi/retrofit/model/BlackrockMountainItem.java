package com.example.hearthstoneapi.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BlackrockMountainItem {

    @SerializedName("img")
    private String img;

    @SerializedName("cost")
    private int cost;

    @SerializedName("collectible")
    private boolean collectible;

    @SerializedName("artist")
    private String artist;

    @SerializedName("health")
    private int health;

    @SerializedName("mechanics")
    private List<MechanicsItem> mechanics;

    @SerializedName("dbfId")
    private String dbfId;

    @SerializedName("type")
    private String type;

    @SerializedName("howToGetGold")
    private String howToGetGold;

    @SerializedName("locale")
    private String locale;

    @SerializedName("flavor")
    private String flavor;

    @SerializedName("playerClass")
    private String playerClass;

    @SerializedName("cardSet")
    private String cardSet;

    @SerializedName("attack")
    private int attack;

    @SerializedName("cardId")
    private String cardId;

    @SerializedName("name")
    private String name;

    @SerializedName("imgGold")
    private String imgGold;

    @SerializedName("howToGet")
    private String howToGet;

    @SerializedName("text")
    private String text;

    @SerializedName("rarity")
    private String rarity;

    @SerializedName("race")
    private String race;

    @SerializedName("elite")
    private boolean elite;

    @SerializedName("faction")
    private String faction;

    @SerializedName("durability")
    private int durability;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isCollectible() {
        return collectible;
    }

    public void setCollectible(boolean collectible) {
        this.collectible = collectible;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<MechanicsItem> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<MechanicsItem> mechanics) {
        this.mechanics = mechanics;
    }

    public String getDbfId() {
        return dbfId;
    }

    public void setDbfId(String dbfId) {
        this.dbfId = dbfId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHowToGetGold() {
        return howToGetGold;
    }

    public void setHowToGetGold(String howToGetGold) {
        this.howToGetGold = howToGetGold;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getCardSet() {
        return cardSet;
    }

    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgGold() {
        return imgGold;
    }

    public void setImgGold(String imgGold) {
        this.imgGold = imgGold;
    }

    public String getHowToGet() {
        return howToGet;
    }

    public void setHowToGet(String howToGet) {
        this.howToGet = howToGet;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isElite() {
        return elite;
    }

    public void setElite(boolean elite) {
        this.elite = elite;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return
                "BlackrockMountainItem{" +
                        "img = '" + img + '\'' +
                        ",cost = '" + cost + '\'' +
                        ",collectible = '" + collectible + '\'' +
                        ",artist = '" + artist + '\'' +
                        ",health = '" + health + '\'' +
                        ",mechanics = '" + mechanics + '\'' +
                        ",dbfId = '" + dbfId + '\'' +
                        ",type = '" + type + '\'' +
                        ",howToGetGold = '" + howToGetGold + '\'' +
                        ",locale = '" + locale + '\'' +
                        ",flavor = '" + flavor + '\'' +
                        ",playerClass = '" + playerClass + '\'' +
                        ",cardSet = '" + cardSet + '\'' +
                        ",attack = '" + attack + '\'' +
                        ",cardId = '" + cardId + '\'' +
                        ",name = '" + name + '\'' +
                        ",imgGold = '" + imgGold + '\'' +
                        ",howToGet = '" + howToGet + '\'' +
                        ",text = '" + text + '\'' +
                        ",rarity = '" + rarity + '\'' +
                        ",race = '" + race + '\'' +
                        ",elite = '" + elite + '\'' +
                        ",faction = '" + faction + '\'' +
                        ",durability = '" + durability + '\'' +
                        "}";
    }
}
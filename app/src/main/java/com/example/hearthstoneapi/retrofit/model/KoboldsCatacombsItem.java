package com.example.hearthstoneapi.retrofit.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class KoboldsCatacombsItem {

    @SerializedName("img")
    private String img;

    @SerializedName("cost")
    private int cost;

    @SerializedName("artist")
    private String artist;

    @SerializedName("dbfId")
    private String dbfId;

    @SerializedName("type")
    private String type;

    @SerializedName("locale")
    private String locale;

    @SerializedName("playerClass")
    private String playerClass;

    @SerializedName("cardSet")
    private String cardSet;

    @SerializedName("cardId")
    private String cardId;

    @SerializedName("faction")
    private String faction;

    @SerializedName("name")
    private String name;

    @SerializedName("imgGold")
    private String imgGold;

    @SerializedName("text")
    private String text;

    @SerializedName("mechanics")
    private List<MechanicsItem> mechanics;

    @SerializedName("race")
    private String race;

    @SerializedName("health")
    private int health;

    @SerializedName("elite")
    private boolean elite;

    @SerializedName("attack")
    private int attack;

    @SerializedName("collectible")
    private boolean collectible;

    @SerializedName("flavor")
    private String flavor;

    @SerializedName("rarity")
    private String rarity;

    @SerializedName("durability")
    private int durability;

    @SerializedName("howToGetGold")
    private String howToGetGold;

    @SerializedName("howToGet")
    private String howToGet;

    @SerializedName("armor")
    private String armor;

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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
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

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MechanicsItem> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<MechanicsItem> mechanics) {
        this.mechanics = mechanics;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isElite() {
        return elite;
    }

    public void setElite(boolean elite) {
        this.elite = elite;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public boolean isCollectible() {
        return collectible;
    }

    public void setCollectible(boolean collectible) {
        this.collectible = collectible;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getHowToGetGold() {
        return howToGetGold;
    }

    public void setHowToGetGold(String howToGetGold) {
        this.howToGetGold = howToGetGold;
    }

    public String getHowToGet() {
        return howToGet;
    }

    public void setHowToGet(String howToGet) {
        this.howToGet = howToGet;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return
                "KoboldsCatacombsItem{" +
                        "img = '" + img + '\'' +
                        ",cost = '" + cost + '\'' +
                        ",artist = '" + artist + '\'' +
                        ",dbfId = '" + dbfId + '\'' +
                        ",type = '" + type + '\'' +
                        ",locale = '" + locale + '\'' +
                        ",playerClass = '" + playerClass + '\'' +
                        ",cardSet = '" + cardSet + '\'' +
                        ",cardId = '" + cardId + '\'' +
                        ",faction = '" + faction + '\'' +
                        ",name = '" + name + '\'' +
                        ",imgGold = '" + imgGold + '\'' +
                        ",text = '" + text + '\'' +
                        ",mechanics = '" + mechanics + '\'' +
                        ",race = '" + race + '\'' +
                        ",health = '" + health + '\'' +
                        ",elite = '" + elite + '\'' +
                        ",attack = '" + attack + '\'' +
                        ",collectible = '" + collectible + '\'' +
                        ",flavor = '" + flavor + '\'' +
                        ",rarity = '" + rarity + '\'' +
                        ",durability = '" + durability + '\'' +
                        ",howToGetGold = '" + howToGetGold + '\'' +
                        ",howToGet = '" + howToGet + '\'' +
                        ",armor = '" + armor + '\'' +
                        "}";
    }
}
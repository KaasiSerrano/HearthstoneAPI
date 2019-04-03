package com.example.hearthstoneapi.retrofit.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class MeanStreetsOfGadgetzanItem {

    @SerializedName("playerClass")
    private String playerClass;

    @SerializedName("img")
    private String img;

    @SerializedName("cost")
    private int cost;

    @SerializedName("artist")
    private String artist;

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

    @SerializedName("dbfId")
    private String dbfId;

    @SerializedName("type")
    private String type;

    @SerializedName("locale")
    private String locale;

    @SerializedName("collectible")
    private boolean collectible;

    @SerializedName("health")
    private int health;

    @SerializedName("flavor")
    private String flavor;

    @SerializedName("elite")
    private boolean elite;

    @SerializedName("attack")
    private int attack;

    @SerializedName("rarity")
    private String rarity;

    @SerializedName("mechanics")
    private List<MechanicsItem> mechanics;

    @SerializedName("race")
    private String race;

    @SerializedName("faction")
    private String faction;

    @SerializedName("classes")
    private List<String> classes;

    @SerializedName("multiClassGroup")
    private String multiClassGroup;

    @SerializedName("durability")
    private int durability;

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

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

    public boolean isCollectible() {
        return collectible;
    }

    public void setCollectible(boolean collectible) {
        this.collectible = collectible;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
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

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public String getMultiClassGroup() {
        return multiClassGroup;
    }

    public void setMultiClassGroup(String multiClassGroup) {
        this.multiClassGroup = multiClassGroup;
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
                "MeanStreetsOfGadgetzanItem{" +
                        "playerClass = '" + playerClass + '\'' +
                        ",img = '" + img + '\'' +
                        ",cost = '" + cost + '\'' +
                        ",artist = '" + artist + '\'' +
                        ",cardSet = '" + cardSet + '\'' +
                        ",cardId = '" + cardId + '\'' +
                        ",name = '" + name + '\'' +
                        ",imgGold = '" + imgGold + '\'' +
                        ",text = '" + text + '\'' +
                        ",dbfId = '" + dbfId + '\'' +
                        ",type = '" + type + '\'' +
                        ",locale = '" + locale + '\'' +
                        ",collectible = '" + collectible + '\'' +
                        ",health = '" + health + '\'' +
                        ",flavor = '" + flavor + '\'' +
                        ",elite = '" + elite + '\'' +
                        ",attack = '" + attack + '\'' +
                        ",rarity = '" + rarity + '\'' +
                        ",mechanics = '" + mechanics + '\'' +
                        ",race = '" + race + '\'' +
                        ",faction = '" + faction + '\'' +
                        ",classes = '" + classes + '\'' +
                        ",multiClassGroup = '" + multiClassGroup + '\'' +
                        ",durability = '" + durability + '\'' +
                        "}";
    }
}
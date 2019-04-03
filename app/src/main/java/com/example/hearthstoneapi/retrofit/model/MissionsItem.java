package com.example.hearthstoneapi.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MissionsItem {

    @SerializedName("img")
    private String img;

    @SerializedName("cost")
    private int cost;

    @SerializedName("health")
    private int health;

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

    @SerializedName("attack")
    private int attack;

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

    @SerializedName("durability")
    private int durability;

    @SerializedName("faction")
    private String faction;

    @SerializedName("mechanics")
    private List<MechanicsItem> mechanics;

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public List<MechanicsItem> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<MechanicsItem> mechanics) {
        this.mechanics = mechanics;
    }

    @Override
    public String toString() {
        return
                "MissionsItem{" +
                        "img = '" + img + '\'' +
                        ",cost = '" + cost + '\'' +
                        ",health = '" + health + '\'' +
                        ",dbfId = '" + dbfId + '\'' +
                        ",type = '" + type + '\'' +
                        ",locale = '" + locale + '\'' +
                        ",playerClass = '" + playerClass + '\'' +
                        ",cardSet = '" + cardSet + '\'' +
                        ",attack = '" + attack + '\'' +
                        ",cardId = '" + cardId + '\'' +
                        ",name = '" + name + '\'' +
                        ",imgGold = '" + imgGold + '\'' +
                        ",text = '" + text + '\'' +
                        ",rarity = '" + rarity + '\'' +
                        ",durability = '" + durability + '\'' +
                        ",faction = '" + faction + '\'' +
                        ",mechanics = '" + mechanics + '\'' +
                        "}";
    }
}
package com.example.hearthstoneapi.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sets {

    @SerializedName("Basic")
    private List<BasicItem> basic;

    @SerializedName("Knights of the Frozen Throne")
    private List<KnightsOfTheFrozenThroneItem> knightsOfTheFrozenThrone;

    @SerializedName("Whispers of the Old Gods")
    private List<WhispersOfTheOldGodsItem> whispersOfTheOldGods;

    @SerializedName("Naxxramas")
    private List<NaxxramasItem> naxxramas;

    @SerializedName("System")
    private List<Object> system;

    @SerializedName("The Boomsday Project")
    private List<TheBoomsdayProjectItem> theBoomsdayProject;

    @SerializedName("Hero Skins")
    private List<HeroSkinsItem> heroSkins;

    @SerializedName("Goblins vs Gnomes")
    private List<GoblinsVsGnomesItem> goblinsVsGnomes;

    @SerializedName("Debug")
    private List<Object> debug;

    @SerializedName("Kobolds & Catacombs")
    private List<KoboldsCatacombsItem> koboldsCatacombs;

    @SerializedName("The Witchwood")
    private List<TheWitchwoodItem> theWitchwood;

    @SerializedName("The Grand Tournament")
    private List<TheGrandTournamentItem> theGrandTournament;

    @SerializedName("Taverns of Time")
    private List<TavernsOfTimeItem> tavernsOfTime;

    @SerializedName("Classic")
    private List<ClassicItem> classic;

    @SerializedName("Blackrock Mountain")
    private List<BlackrockMountainItem> blackrockMountain;

    @SerializedName("Journey to Un'Goro")
    private List<JourneyToUnGoroItem> journeyToUnGoro;

    @SerializedName("Missions")
    private List<MissionsItem> missions;

    @SerializedName("One Night in Karazhan")
    private List<OneNightInKarazhanItem> oneNightInKarazhan;

    @SerializedName("Rastakhan's Rumble")
    private List<RastakhanSRumbleItem> rastakhanSRumble;

    @SerializedName("Tavern Brawl")
    private List<TavernBrawlItem> tavernBrawl;

    @SerializedName("Hall of Fame")
    private List<HallOfFameItem> hallOfFame;

    @SerializedName("Credits")
    private List<CreditsItem> credits;

    @SerializedName("Promo")
    private List<Object> promo;

    @SerializedName("The League of Explorers")
    private List<TheLeagueOfExplorersItem> theLeagueOfExplorers;

    @SerializedName("Mean Streets of Gadgetzan")
    private List<MeanStreetsOfGadgetzanItem> meanStreetsOfGadgetzan;

    public List<BasicItem> getBasic() {
        return basic;
    }

    public void setBasic(List<BasicItem> basic) {
        this.basic = basic;
    }

    public List<KnightsOfTheFrozenThroneItem> getKnightsOfTheFrozenThrone() {
        return knightsOfTheFrozenThrone;
    }

    public void setKnightsOfTheFrozenThrone(List<KnightsOfTheFrozenThroneItem> knightsOfTheFrozenThrone) {
        this.knightsOfTheFrozenThrone = knightsOfTheFrozenThrone;
    }

    public List<WhispersOfTheOldGodsItem> getWhispersOfTheOldGods() {
        return whispersOfTheOldGods;
    }

    public void setWhispersOfTheOldGods(List<WhispersOfTheOldGodsItem> whispersOfTheOldGods) {
        this.whispersOfTheOldGods = whispersOfTheOldGods;
    }

    public List<NaxxramasItem> getNaxxramas() {
        return naxxramas;
    }

    public void setNaxxramas(List<NaxxramasItem> naxxramas) {
        this.naxxramas = naxxramas;
    }

    public List<Object> getSystem() {
        return system;
    }

    public void setSystem(List<Object> system) {
        this.system = system;
    }

    public List<TheBoomsdayProjectItem> getTheBoomsdayProject() {
        return theBoomsdayProject;
    }

    public void setTheBoomsdayProject(List<TheBoomsdayProjectItem> theBoomsdayProject) {
        this.theBoomsdayProject = theBoomsdayProject;
    }

    public List<HeroSkinsItem> getHeroSkins() {
        return heroSkins;
    }

    public void setHeroSkins(List<HeroSkinsItem> heroSkins) {
        this.heroSkins = heroSkins;
    }

    public List<GoblinsVsGnomesItem> getGoblinsVsGnomes() {
        return goblinsVsGnomes;
    }

    public void setGoblinsVsGnomes(List<GoblinsVsGnomesItem> goblinsVsGnomes) {
        this.goblinsVsGnomes = goblinsVsGnomes;
    }

    public List<Object> getDebug() {
        return debug;
    }

    public void setDebug(List<Object> debug) {
        this.debug = debug;
    }

    public List<KoboldsCatacombsItem> getKoboldsCatacombs() {
        return koboldsCatacombs;
    }

    public void setKoboldsCatacombs(List<KoboldsCatacombsItem> koboldsCatacombs) {
        this.koboldsCatacombs = koboldsCatacombs;
    }

    public List<TheWitchwoodItem> getTheWitchwood() {
        return theWitchwood;
    }

    public void setTheWitchwood(List<TheWitchwoodItem> theWitchwood) {
        this.theWitchwood = theWitchwood;
    }

    public List<TheGrandTournamentItem> getTheGrandTournament() {
        return theGrandTournament;
    }

    public void setTheGrandTournament(List<TheGrandTournamentItem> theGrandTournament) {
        this.theGrandTournament = theGrandTournament;
    }

    public List<TavernsOfTimeItem> getTavernsOfTime() {
        return tavernsOfTime;
    }

    public void setTavernsOfTime(List<TavernsOfTimeItem> tavernsOfTime) {
        this.tavernsOfTime = tavernsOfTime;
    }

    public List<ClassicItem> getClassic() {
        return classic;
    }

    public void setClassic(List<ClassicItem> classic) {
        this.classic = classic;
    }

    public List<BlackrockMountainItem> getBlackrockMountain() {
        return blackrockMountain;
    }

    public void setBlackrockMountain(List<BlackrockMountainItem> blackrockMountain) {
        this.blackrockMountain = blackrockMountain;
    }

    public List<JourneyToUnGoroItem> getJourneyToUnGoro() {
        return journeyToUnGoro;
    }

    public void setJourneyToUnGoro(List<JourneyToUnGoroItem> journeyToUnGoro) {
        this.journeyToUnGoro = journeyToUnGoro;
    }

    public List<MissionsItem> getMissions() {
        return missions;
    }

    public void setMissions(List<MissionsItem> missions) {
        this.missions = missions;
    }

    public List<OneNightInKarazhanItem> getOneNightInKarazhan() {
        return oneNightInKarazhan;
    }

    public void setOneNightInKarazhan(List<OneNightInKarazhanItem> oneNightInKarazhan) {
        this.oneNightInKarazhan = oneNightInKarazhan;
    }

    public List<RastakhanSRumbleItem> getRastakhanSRumble() {
        return rastakhanSRumble;
    }

    public void setRastakhanSRumble(List<RastakhanSRumbleItem> rastakhanSRumble) {
        this.rastakhanSRumble = rastakhanSRumble;
    }

    public List<TavernBrawlItem> getTavernBrawl() {
        return tavernBrawl;
    }

    public void setTavernBrawl(List<TavernBrawlItem> tavernBrawl) {
        this.tavernBrawl = tavernBrawl;
    }

    public List<HallOfFameItem> getHallOfFame() {
        return hallOfFame;
    }

    public void setHallOfFame(List<HallOfFameItem> hallOfFame) {
        this.hallOfFame = hallOfFame;
    }

    public List<CreditsItem> getCredits() {
        return credits;
    }

    public void setCredits(List<CreditsItem> credits) {
        this.credits = credits;
    }

    public List<Object> getPromo() {
        return promo;
    }

    public void setPromo(List<Object> promo) {
        this.promo = promo;
    }

    public List<TheLeagueOfExplorersItem> getTheLeagueOfExplorers() {
        return theLeagueOfExplorers;
    }

    public void setTheLeagueOfExplorers(List<TheLeagueOfExplorersItem> theLeagueOfExplorers) {
        this.theLeagueOfExplorers = theLeagueOfExplorers;
    }

    public List<MeanStreetsOfGadgetzanItem> getMeanStreetsOfGadgetzan() {
        return meanStreetsOfGadgetzan;
    }

    public void setMeanStreetsOfGadgetzan(List<MeanStreetsOfGadgetzanItem> meanStreetsOfGadgetzan) {
        this.meanStreetsOfGadgetzan = meanStreetsOfGadgetzan;
    }

    @Override
    public String toString() {
        return
                "Sets{" +
                        "basic = '" + basic + '\'' +
                        ",knights of the Frozen Throne = '" + knightsOfTheFrozenThrone + '\'' +
                        ",whispers of the Old Gods = '" + whispersOfTheOldGods + '\'' +
                        ",naxxramas = '" + naxxramas + '\'' +
                        ",system = '" + system + '\'' +
                        ",the Boomsday Project = '" + theBoomsdayProject + '\'' +
                        ",hero Skins = '" + heroSkins + '\'' +
                        ",goblins vs Gnomes = '" + goblinsVsGnomes + '\'' +
                        ",debug = '" + debug + '\'' +
                        ",kobolds & Catacombs = '" + koboldsCatacombs + '\'' +
                        ",the Witchwood = '" + theWitchwood + '\'' +
                        ",the Grand Tournament = '" + theGrandTournament + '\'' +
                        ",taverns of Time = '" + tavernsOfTime + '\'' +
                        ",classic = '" + classic + '\'' +
                        ",blackrock Mountain = '" + blackrockMountain + '\'' +
                        ",journey to Un'Goro = '" + journeyToUnGoro + '\'' +
                        ",missions = '" + missions + '\'' +
                        ",one Night in Karazhan = '" + oneNightInKarazhan + '\'' +
                        ",rastakhan's Rumble = '" + rastakhanSRumble + '\'' +
                        ",tavern Brawl = '" + tavernBrawl + '\'' +
                        ",hall of Fame = '" + hallOfFame + '\'' +
                        ",credits = '" + credits + '\'' +
                        ",promo = '" + promo + '\'' +
                        ",the League of Explorers = '" + theLeagueOfExplorers + '\'' +
                        ",mean Streets of Gadgetzan = '" + meanStreetsOfGadgetzan + '\'' +
                        "}";
    }
}
package com.fairlight.submission.myfavoritegames;

import java.io.Serializable;

public class Game implements Serializable {

    //these variables are used to list game items
    private int photo;
    private String name;
    private String first_impression;
    private String platform;
    private String played_since;
    private String genre;

    //more variables, used to list detail of each game
    private int photo_bigsize;
    private int photo_round;
    private String quote;
    private String developer;
    private String available_platform;
    private String release_date;
    private String game_description;
    private int photo_game_screenshot;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_impression() {
        return first_impression;
    }

    public void setFirst_impression(String first_impression) {
        this.first_impression = first_impression;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlayed_since() {
        return played_since;
    }

    public void setPlayed_since(String played_since) {
        this.played_since = played_since;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPhoto_bigsize() {
        return photo_bigsize;
    }

    public void setPhoto_bigsize(int photo_bigsize) {
        this.photo_bigsize = photo_bigsize;
    }

    public int getPhoto_round() {
        return photo_round;
    }

    public void setPhoto_round(int photo_round) {
        this.photo_round = photo_round;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getAvailable_platform() {
        return available_platform;
    }

    public void setAvailable_platform(String available_platform) {
        this.available_platform = available_platform;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getGame_description() {
        return game_description;
    }

    public void setGame_description(String game_description) {
        this.game_description = game_description;
    }

    public int getPhoto_game_screenshot() {
        return photo_game_screenshot;
    }

    public void setPhoto_game_screenshot(int photo_game_screenshot) {
        this.photo_game_screenshot = photo_game_screenshot;
    }
}

package com.app.palpharmacy.model;

/**
 * Created by Aws on 11/03/2018.
 */

public class Pharmacy {

    private String name;
    private String Description;
//    private String rating;
    private int nb_episode;
    private String city;
//    private String studio;
    private String image_url;

    public Pharmacy() {
    }

    public Pharmacy(String name, String description, String rating, int nb_episode, String categorie, String studio, String image_url) {
        this.name = name;
        Description = description;
//        this.rating = rating;
        this.nb_episode = nb_episode;
        this.city = city;
//        this.studio = studio;
        this.image_url = image_url;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

//    public String getRating() {
//        return rating;
//    }
//
//    public void setRating(String rating) {
//        this.rating = rating;
//    }

    public int getNb_episode() {
        return nb_episode;
    }

    public void setNb_episode(int nb_episode) {
        this.nb_episode = nb_episode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

//    public String getStudio() {
//        return studio;
//    }
//
//    public void setStudio(String studio) {
//        this.studio = studio;
//    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}

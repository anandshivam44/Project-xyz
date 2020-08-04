package com.invig.indiastatusapp.model;

/**
 * Created by umashankar on 10/07/2020. bought on codecanyon for about 10 days ago30/09/2017.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Language {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("image")
    @Expose
    private String image;
    private boolean isSelected = false;




    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public Language(Language language) {
        this.id = language.id;
        this.language = language.language;
        this.image = language.image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
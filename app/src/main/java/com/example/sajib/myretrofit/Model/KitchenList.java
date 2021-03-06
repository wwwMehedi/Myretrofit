package com.example.sajib.myretrofit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class KitchenList {

    @SerializedName("kitchen_id")
    @Expose
    private Integer kitchenId;
    @SerializedName("kitchen_name")
    @Expose
    private String kitchenName;
    @SerializedName("kitchen_image")
    @Expose
    private String kitchenImage;
    @SerializedName("det_address")
    @Expose
    private String detAddress;
    @SerializedName("area_name")
    @Expose
    private String areaName;
    @SerializedName("cuisine")
    @Expose
    private String cuisine;
    @SerializedName("owener_info")
    @Expose
    private String owenerInfo;
    @SerializedName("location_lang")
    @Expose
    private double locationLang;
    @SerializedName("location_lat")
    @Expose
    private double locationLat;
    @SerializedName("slogan")
    @Expose
    private String slogan;
    @SerializedName("open_hour")
    @Expose
    private String openHour;
    @SerializedName("closing_hour")
    @Expose
    private String closingHour;
    @SerializedName("rating")
    @Expose
    private double rating;
    @SerializedName("review")
    @Expose
    private List<Review> review = null;
    @SerializedName("kitchen_vat")
    @Expose
    private Integer kitchenVat;
    @SerializedName("kitchen_status")
    @Expose
    private Integer kitchenStatus;


    public KitchenList(Integer kitchenId, String kitchenName, String kitchenImage, String detAddress, String areaName, String cuisine,
                       String owenerInfo, double locationLang, double locationLat, String slogan, String openHour,
                       String closingHour, double rating, List<Review> review, Integer kitchenVat, Integer kitchenStatus) {
        this.kitchenId = kitchenId;
        this.kitchenName = kitchenName;
        this.kitchenImage = kitchenImage;
        this.detAddress = detAddress;
        this.areaName = areaName;
        this.cuisine = cuisine;
        this.owenerInfo = owenerInfo;
        this.locationLang = locationLang;
        this.locationLat = locationLat;
        this.slogan = slogan;
        this.openHour = openHour;
        this.closingHour = closingHour;
        this.rating = rating;
        this.review = review;
        this.kitchenVat = kitchenVat;
        this.kitchenStatus = kitchenStatus;
    }

    public KitchenList() {
    }

    public Integer getKitchenId() {
        return kitchenId;
    }

    public void setKitchenId(Integer kitchenId) {
        this.kitchenId = kitchenId;
    }

    public String getKitchenName() {
        return kitchenName;
    }

    public void setKitchenName(String kitchenName) {
        this.kitchenName = kitchenName;
    }

    public String getKitchenImage() {
        return kitchenImage;
    }

    public void setKitchenImage(String kitchenImage) {
        this.kitchenImage = kitchenImage;
    }

    public String getDetAddress() {
        return detAddress;
    }

    public void setDetAddress(String detAddress) {
        this.detAddress = detAddress;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getOwenerInfo() {
        return owenerInfo;
    }

    public void setOwenerInfo(String owenerInfo) {
        this.owenerInfo = owenerInfo;
    }

    public void setLocationLat(Integer locationLat) {
        this.locationLat = locationLat;
    }

    public String getSlogan() {
        return slogan;
    }

    public double getLocationLang() {
        return locationLang;
    }

    public void setLocationLang(double locationLang) {
        this.locationLang = locationLang;
    }

    public double getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(double locationLat) {
        this.locationLat = locationLat;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getOpenHour() {
        return openHour;
    }

    public void setOpenHour(String openHour) {
        this.openHour = openHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getKitchenVat() {
        return kitchenVat;
    }

    public void setKitchenVat(Integer kitchenVat) {
        this.kitchenVat = kitchenVat;
    }

    public Integer getKitchenStatus() {
        return kitchenStatus;
    }

    public void setKitchenStatus(Integer kitchenStatus) {
        this.kitchenStatus = kitchenStatus;
    }
}
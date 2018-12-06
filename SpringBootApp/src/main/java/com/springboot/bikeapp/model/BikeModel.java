package com.springboot.bikeapp.model;

/**
 * Created by vinayraghavtiwari on 06/12/18.
 */
public class BikeModel {

    private Integer id;
    private String bikeName;
    private String bikeModel;
    private String bikeType;

    public BikeModel(Integer id, String bikeName, String bikeModel, String bikeType) {
        this.id = id;
        this.bikeName = bikeName;
        this.bikeModel = bikeModel;
        this.bikeType = bikeType;
    }

    public Integer getId() {
        return id;
    }

    public String getBikeName() {
        return bikeName;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }


}

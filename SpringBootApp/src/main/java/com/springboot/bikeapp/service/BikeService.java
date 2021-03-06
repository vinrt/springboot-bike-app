package com.springboot.bikeapp.service;

import com.springboot.bikeapp.model.BikeModel;

import java.util.Set;



public interface BikeService {

    void addBikeDetails(BikeModel bikeModel);

    Set<BikeModel> getBikeDetails();
    
    void updateBikes(BikeModel bikeModel);

    BikeModel findById(Integer id);
}

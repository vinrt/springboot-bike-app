package com.springboot.bikeapp.service;

import com.springboot.bikeapp.model.BikeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by vinayraghavtiwari on 06/12/18.
 */


public interface BikeService {

    public void addBikeDetails(BikeModel bikeModel);

    public Set<BikeModel> getBikeDetails();

    public BikeModel findById(Integer id);
}

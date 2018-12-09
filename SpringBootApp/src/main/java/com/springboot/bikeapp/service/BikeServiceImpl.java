package com.springboot.bikeapp.service;

import com.springboot.bikeapp.model.BikeModel;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class BikeServiceImpl implements BikeService {

    public Set<BikeModel> bikemodelset = new HashSet<>();


    @Override
    public void addBikeDetails(BikeModel bikeModel) {

        bikeModel.setId((bikemodelset.size()+1));
        bikemodelset.add(bikeModel);

    }

    @Override
    public Set<BikeModel> getBikeDetails() {
        return bikemodelset;

    }

    @Override
    public BikeModel findById(Integer id) {

        for(BikeModel bikemodel : bikemodelset) {
            if (id.equals(bikemodel.getId())){
                return bikemodel;
            }
        }

        return null;
    }
}

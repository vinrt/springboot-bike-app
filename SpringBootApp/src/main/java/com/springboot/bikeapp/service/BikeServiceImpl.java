package com.springboot.bikeapp.service;

import com.springboot.bikeapp.model.BikeModel;
import com.sun.tools.classfile.Opcode;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vinayraghavtiwari on 06/12/18.
 */
@Service
public class BikeServiceImpl implements BikeService {

    public Set<BikeModel> bikemodelset = new HashSet<>();


    @Override
    public void addBikeDetails(BikeModel bikeModel) {

        bikeModel.setId(1);
        bikeModel.setBikeModel("2019");
        bikeModel.setBikeName("Harley");
        bikeModel.setBikeType("Vintage");

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

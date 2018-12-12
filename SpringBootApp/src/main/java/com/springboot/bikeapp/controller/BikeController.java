package com.springboot.bikeapp.controller;


/**
 * Created by vinayraghavtiwari on 06/12/18.
 */

import com.springboot.bikeapp.model.BikeModel;
import com.springboot.bikeapp.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(BikeController.BASE_URL)
public class BikeController {

    public static final String BASE_URL = "vinns/bikes";

    @Autowired
    private BikeService bikeservice;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Set<BikeModel> getDetails() {
        return bikeservice.getBikeDetails();
    }

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET)
    public BikeModel getId(@PathVariable Integer Id) {
        return bikeservice.findById(Id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addDetails(@RequestParam String bikeName,
                           @RequestParam String bikeModel,
                           @RequestParam String bikeType) {

        BikeModel bike = new BikeModel();
        bike.setBikeName(bikeName);
        bike.setBikeModel(bikeModel);
        bike.setBikeType(bikeType);
        bikeservice.addBikeDetails(bike);

    }
    @RequestMapping(value = "/update/{Id}", method = RequestMethod.POST)
    public void updateDetails(@PathVariable Integer Id,
    					   @RequestParam String bikeName,
                           @RequestParam String bikeModel,
                           @RequestParam String bikeType) {
    	BikeModel bike = bikeservice.findById(Id);
    	if(bike !=null) {
    		if(bikeName !=null && !bikeName.isEmpty())
    		bike.setBikeName(bikeName);
    		if(bikeModel !=null && !bikeModel.isEmpty())
    		bike.setBikeModel(bikeModel);
    		if(bikeType !=null && !bikeType.isEmpty())
    		bike.setBikeType(bikeType);
    		
    		bikeservice.updateBikes(bike);
    	}
    	
    }
}

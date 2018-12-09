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

    @RequestMapping("/findbikes")
    public Set<BikeModel> getDetails() {
        return bikeservice.getBikeDetails();
    }

    @RequestMapping("/{Id}")
    public BikeModel getId(@PathVariable Integer Id) {
        return bikeservice.findById(Id);
    }

    @RequestMapping(value = "/addbikes", method = RequestMethod.POST)
    public void addDetails(@RequestParam String bikeName,
                           @RequestParam String bikeModel,
                           @RequestParam String bikeType) {

        BikeModel bike = new BikeModel();
        bike.setBikeName(bikeName);
        bike.setBikeModel(bikeModel);
        bike.setBikeType(bikeType);
        bikeservice.addBikeDetails(bike);

    }
}

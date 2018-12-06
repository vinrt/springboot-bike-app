package com.springboot.bikeapp.controller;


/**
 * Created by vinayraghavtiwari on 06/12/18.
 */

import com.springboot.bikeapp.model.BikeModel;
import com.springboot.bikeapp.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(BikeController.BASE_URL)
public class BikeController {

    public static final String BASE_URL = "vinns/bikes";

    @Autowired
    private BikeService bikeservice;

    @RequestMapping("/details")
    public Set<BikeModel> getDetails(){
        return bikeservice.getBikeDetails();
    }

    @RequestMapping("/{Id}")
    public BikeModel getId(@PathVariable Integer Id){
        return bikeservice.findById(Id);
    }

    @RequestMapping("/add")
    public void addDetails(BikeModel bike){

        bikeservice.addBikeDetails(bike);

    }
}

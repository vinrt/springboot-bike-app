package com.springboot.bikeapp; /**
 * Created by vinayraghavtiwari on 06/12/18.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BikeApplication {

    public static void main(String args[])
    {
        ApplicationContext context = SpringApplication.run(BikeApplication.class,args);
    }
}

package com.noname.controller;

import com.noname.database.JobOffer;
import com.noname.database.JobOfferRepository;
import com.noname.searchTools.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Kura on 20.05.2017.
 */

@RestController
@RequestMapping("/filters")
public class FiltersController {

    @Autowired
    private JobOfferRepository jobOfferRepository;



    @RequestMapping("/getAllFilters")
    public Filter getAllFilters(){

        Filter filter = new Filter();

        List<JobOffer> offers = jobOfferRepository.findAll();
        System.out.println(offers);
        for( JobOffer offer: offers) {
            try{
                filter.getContractType().add(offer.getContractType());
                filter.getJobType().add(offer.getJobType());
                filter.getTimeType().add(offer.getTimeType());
                List<String> skillList = Arrays.asList(offer.getSkills().split(","));
                for(String str : skillList) {
                    filter.getSkills().add(str);
                }

                filter.getField().add(offer.getField());
                System.out.println(filter);
            }catch (Exception exc) {
                System.out.println(exc);
            }


        }
        System.out.println(filter);
        return filter;
    }

}

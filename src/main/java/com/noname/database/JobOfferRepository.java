package com.noname.database;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "joboffers")
public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {

    public List<JobOffer> findByCity(String city);

}

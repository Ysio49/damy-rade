package com.noname.database;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "joboffers")
public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {

}

package com.noname.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobOffer {

    @Id
    @GeneratedValue
    private String title;
    private String dateAdded;
    private String
}

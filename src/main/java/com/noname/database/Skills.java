package com.noname.database;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Kura on 19.05.2017.
 */
public class Skills {
    @Id
    @GeneratedValue
    private Long id;
    private String skillname;
}

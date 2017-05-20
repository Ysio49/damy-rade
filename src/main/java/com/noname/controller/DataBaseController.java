package com.noname.controller;

import com.noname.database.User;
import com.noname.database.UserRepository;
import org.hibernate.validator.internal.util.IgnoreJava6Requirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataBaseController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/addNewUser", method= RequestMethod.POST)
    public void addNewUser(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("birthDate") String birthDate,
                           @RequestParam("password") String password,
                           @RequestParam("emailAddress") String emailAddress,
                           @RequestParam("city") String city,
                           @RequestParam("postcode") String postcode,
                           @RequestParam("street") String street,
                           @RequestParam("homeNumber") String homeNumber) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBirthDate(birthDate);
        user.setPassword(password);
        user.setEmailAddress(emailAddress);
        user.setCity(city);
        user.setStreet(street);
        user.setPostcode(postcode);
        user.setHomeNumber(homeNumber);

        userRepository.save(user);
    }

    @RequestMapping("/validateUser")
    public User validateUser(@RequestParam("email") String email,
                                @RequestParam("password") String password) {
        User user = userRepository.findByEmailAddressAndPassword(email,password);
        if(user!=null) {
            return user;
        } else {
            return null;
        }
    }

    @RequestMapping("/getUser")
    public User getUser(@RequestParam("email") String email) {
        User user = userRepository.findByEmailAddress(email);
        return user;
    }

}

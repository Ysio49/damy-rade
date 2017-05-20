package com.noname.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

@RestResource(path = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmailAddressAndPassword(String email, String password);
    public User findByEmailAddress(@Param("email") String email);
}

package com.hotspot.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService uService;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> findAll() {
        return new ResponseEntity<List<User>>(uService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User u = (User) uService.findById(id);
		return new ResponseEntity<User>(u, HttpStatus.OK);
	}

}
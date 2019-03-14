package com.hotspot.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository uRepo;

    public List<User> getAll() {
        return (List<User>) uRepo.findAll();
    }

    public User findById(long id) {
        Optional<User> u = uRepo.findById(id);
        if(u.isPresent()) return u.get();
        else return null;
	}

    public User add(User u) {
		return uRepo.save(u);
	}

}
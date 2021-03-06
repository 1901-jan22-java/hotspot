package com.hotspot.app;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmailLikeIgnoreCase(String email);

}

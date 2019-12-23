package com.otsi.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.otsi.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, String> {
}

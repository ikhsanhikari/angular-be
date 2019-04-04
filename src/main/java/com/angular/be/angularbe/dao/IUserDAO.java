package com.angular.be.angularbe.dao;

import com.angular.be.angularbe.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDAO extends JpaRepository<User,Integer> {
}

package com.demo.dao;

import com.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<User,Long> {

}

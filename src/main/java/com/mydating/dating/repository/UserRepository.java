package com.mydating.dating.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mydating.dating.entity.User;
import com.mydating.dating.util.UserGender;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByGender(UserGender male);

	List<User> findUserById(int id);
	
	@Query("select u from User u where u.name like ?1?2")
	List<User> searchByName(String letters);
	


}

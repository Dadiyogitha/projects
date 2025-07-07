package com.in.supplementStore.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.supplementStore.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByUsername(String username);

}

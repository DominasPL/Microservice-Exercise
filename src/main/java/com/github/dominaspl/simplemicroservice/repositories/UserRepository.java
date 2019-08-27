package com.github.dominaspl.simplemicroservice.repositories;

import com.github.dominaspl.simplemicroservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}

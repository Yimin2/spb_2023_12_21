package com.ll.spb_2023_12_19_2.repository;

import com.ll.spb_2023_12_19_2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

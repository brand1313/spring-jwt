package com.brand13.jwt.jwttest.repository;

import com.brand13.jwt.jwttest.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {}

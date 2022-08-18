package com.brand13.jwt.jwttest.repository;

import com.brand13.jwt.jwttest.domain.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities") //EntityGraph는 쿼리가 수행이 될 때 Lazy조회가 아니고 Eager 조회로 authorities 정보를 같이 가져오게 된다.
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}

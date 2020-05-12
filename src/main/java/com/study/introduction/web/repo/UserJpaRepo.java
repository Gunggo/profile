package com.study.introduction.web.repo;

import com.study.introduction.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User, Integer> {
}

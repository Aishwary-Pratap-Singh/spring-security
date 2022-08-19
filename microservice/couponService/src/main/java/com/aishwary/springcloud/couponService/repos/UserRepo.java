package com.aishwary.springcloud.couponService.repos;

import com.aishwary.springcloud.couponService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String username);
}

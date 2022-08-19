package com.aishwary.springcloud.couponService.repos;

import com.aishwary.springcloud.couponService.model.Role;
import com.aishwary.springcloud.couponService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
//    User findByEmail(String email);
}

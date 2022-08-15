package com.aishwary.springcloud.couponService.repos;

import com.aishwary.springcloud.couponService.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepo extends JpaRepository<Coupon, Long> {
    Coupon findByCode(String code);
}

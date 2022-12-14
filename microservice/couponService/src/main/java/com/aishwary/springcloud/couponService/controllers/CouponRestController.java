package com.aishwary.springcloud.couponService.controllers;

import com.aishwary.springcloud.couponService.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.aishwary.springcloud.couponService.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

    @Autowired
    CouponRepo repo;


    @PostMapping(value = "/coupons")
    public Coupon create(@RequestBody Coupon coupon){
        return repo.save(coupon);
    }

    @GetMapping(value = "/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return repo.findByCode(code);
    }


}

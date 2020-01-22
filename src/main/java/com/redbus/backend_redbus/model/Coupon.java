package com.redbus.backend_redbus.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   private String couponCode;
   private String couponName;
   private int offPercent;
   private int maxOffPrice;
   private Date expiryTime;
}

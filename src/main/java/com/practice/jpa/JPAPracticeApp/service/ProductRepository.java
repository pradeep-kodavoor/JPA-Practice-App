package com.practice.jpa.JPAPracticeApp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.jpa.JPAPracticeApp.entity.MyProduct;

public interface ProductRepository extends JpaRepository<MyProduct, Long> {

}

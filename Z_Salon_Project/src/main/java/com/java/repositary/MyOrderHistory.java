package com.java.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.entity.*;


@Repository
public interface MyOrderHistory extends JpaRepository<MyOrderHistory, Integer>{

}

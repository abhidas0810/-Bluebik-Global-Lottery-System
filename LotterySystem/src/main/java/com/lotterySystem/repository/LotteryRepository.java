package com.lotterySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lotterySystem.entity.Lottery;

@Repository
public interface LotteryRepository extends JpaRepository<Lottery, Long> {

}

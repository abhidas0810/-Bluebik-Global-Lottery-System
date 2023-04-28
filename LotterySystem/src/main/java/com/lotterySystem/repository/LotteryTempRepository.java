package com.lotterySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lotterySystem.entity.LotteryTemp;

@Repository
public interface LotteryTempRepository extends JpaRepository<LotteryTemp, Long> {

}

package com.lotterySystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lotterySystem.entity.Winner;

@Repository
public interface WinnerRepository extends JpaRepository<Winner, Long> {

}

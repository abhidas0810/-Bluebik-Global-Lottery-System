package com.lotterySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.lotterySystem.entity.Lottery;
import com.lotterySystem.service.LotteryService;
import com.lotterySystem.service.WinnerService;
import com.lotterySystem.entity.Winner;

@Configuration
@EnableScheduling
public class LotteryScheduler {

	@Autowired
	private LotteryService lotteryService;

	@Autowired
	private WinnerService winnerService;

	@Scheduled(cron = "0 0 0 * * *")
	public void pushLotteryNumbers() {
		List<Lottery> lotteryNumbers = lotteryService.addLotteryNumbers();
	}

	@Scheduled(cron = "0 10 6 * * *") // runs at 6:10am every day
	public void checkLotteryNumbers() {
		Boolean winnerIsPredent = winnerService.checkLotteryNumbers();
	}

	@Scheduled(cron = "0 0 6 * * *") // runs at 6:10am every day
	public void Winner() {
		Winner winner = winnerService.addWinner();
	}

}

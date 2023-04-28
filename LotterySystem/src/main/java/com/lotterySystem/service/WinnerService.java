package com.lotterySystem.service;

import java.util.Date;

import com.lotterySystem.entity.Winner;

public interface WinnerService {

	public Winner addWinner();
	
	public Winner getWinnerToday();
	
	public Boolean checkLotteryNumbers();

}

package com.lotterySystem.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotterySystem.entity.Lottery;
import com.lotterySystem.entity.Winner;
import com.lotterySystem.repository.LotteryRepository;
import com.lotterySystem.repository.WinnerRepository;

@Service
public class WinnerServiceImpl implements WinnerService {

	@Autowired
	private WinnerRepository winnerRepository;

	@Autowired
	private LotteryRepository lotteryRepository;

	@Override
	public Winner addWinner() {
		List<Lottery> list = lotteryRepository.findAll();
		Long i = (long) list.size();
		Long j = i / 2;
		Lottery lottery = new Lottery();
		for (Lottery lotter : list) {
			if (i == j) {
				lottery = lotter;
			}
		}
		Winner winner = new Winner();
		winner.setDate(new Date());
		winner.setLottery(lottery);
		return winnerRepository.save(winner);
	}

	@Override
	public Winner getWinnerToday() {
		List<Winner> list = winnerRepository.findAll();
		Winner winner = new Winner();
		Date date = new Date();
		for (Winner winne : list) {
			if (winne.getDate().compareTo(date) < 1) {
				winner = winne;
				break;
			}
		}
		return winner;
	}
	
	@Override
	public Boolean checkLotteryNumbers() {
		HashSet<Winner> winners = (HashSet<Winner>) winnerRepository.findAll();
		Date date = new Date();
		for (Winner winner : winners) {
			if (winner.getDate().compareTo(date) < 1) {
				return true;
			}
		}
		return false;
	}

}

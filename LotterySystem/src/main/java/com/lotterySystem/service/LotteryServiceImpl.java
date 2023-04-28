package com.lotterySystem.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotterySystem.entity.Lottery;
import com.lotterySystem.entity.LotteryTemp;
import com.lotterySystem.entity.Winner;
import com.lotterySystem.repository.LotteryRepository;
import com.lotterySystem.repository.LotteryTempRepository;
import com.lotterySystem.repository.WinnerRepository;

@Service
public class LotteryServiceImpl implements LotteryService {

	@Autowired
	private LotteryRepository lotteryRepository;

	@Autowired
	private LotteryTempRepository lotteryTempRepository;

	@Autowired
	private WinnerRepository winnerRepository;

	@Override
	public List<Lottery> addLotteryNumbers() {
		List<LotteryTemp> lotteries = lotteryTempRepository.findAll();
		Date date = new Date();
		List<Lottery> list = new ArrayList<>();
		for (LotteryTemp lottery : lotteries) {
			if (lottery.getDate().compareTo(date) < 2) {
				Lottery lotter = new Lottery();
				lotter.setDate(lottery.getDate());
				lotter.setLotteryNumber(lottery.getLotteryNumber());
				lotteryRepository.save(lotter);
				list.add(lotter);
			}
		}
		return list;
	}

}

package com.lotterySystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotterySystem.entity.LotteryTemp;
import com.lotterySystem.repository.LotteryTempRepository;

@Service
public class LotteryTempServiceImpl implements LotteryTempService {

	@Autowired
	private LotteryTempRepository lotteryTempRepository;

	@Override
	public LotteryTemp addLotteryNumbers(LotteryTemp lottery) {
		return lotteryTempRepository.save(lottery);
	}

}

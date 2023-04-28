package com.lotterySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lotterySystem.entity.LotteryTemp;
import com.lotterySystem.service.LotteryTempService;

@RestController
public class LotteryTempController {

	@Autowired
	private LotteryTempService lotteryTempService;

	@PostMapping("/addLotteryNumbers")
	public ResponseEntity<LotteryTemp> addLotteryNumbers(@RequestBody LotteryTemp lottery) {
		return new ResponseEntity<LotteryTemp>(lotteryTempService.addLotteryNumbers(lottery), HttpStatus.CREATED);
	}

}

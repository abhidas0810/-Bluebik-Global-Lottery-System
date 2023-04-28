package com.lotterySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotterySystem.entity.Winner;
import com.lotterySystem.service.WinnerService;

@RestController
public class WinnerController {

	@Autowired
	private WinnerService winnerService;

	@GetMapping("/winner")
	public ResponseEntity<Winner> getWinner() {
		return new ResponseEntity<Winner>(winnerService.getWinnerToday(), HttpStatus.OK);
	}

}

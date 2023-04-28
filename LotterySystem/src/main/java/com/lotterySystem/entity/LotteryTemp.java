package com.lotterySystem.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class LotteryTemp {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private Long lotteryNumber;	

	private Date date;
}

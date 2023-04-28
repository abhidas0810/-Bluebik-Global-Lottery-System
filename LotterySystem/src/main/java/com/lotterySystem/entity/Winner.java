package com.lotterySystem.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Winner {

	@Id
	@GeneratedValue
	private Long winnerId;

	private Date date;

	@OneToOne(cascade = CascadeType.ALL)
	private Lottery lottery;

}

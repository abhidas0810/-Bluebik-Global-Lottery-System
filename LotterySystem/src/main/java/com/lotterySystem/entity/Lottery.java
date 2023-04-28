package com.lotterySystem.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Lottery {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private Long lotteryNumber;	

	private Date date;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "lottery")
	private Winner winner;
}

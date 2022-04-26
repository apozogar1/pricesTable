package com.example.pricestable.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pricestable.dto.PricesDto;
import com.example.pricestable.services.PricesServices;

/**
 * Controller PricesController.
 */
@RestController
@RequestMapping("/prices")
public class PricesContoller {

	/** The service. */
	@Autowired
	private PricesServices service;

	@GetMapping
	public PricesDto findAll(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
			@RequestParam Long productId, @RequestParam Long brandId) {
		return service.findPricesByStartDateAndProductIdAndbrandId(startDate, productId, brandId);
	}
}

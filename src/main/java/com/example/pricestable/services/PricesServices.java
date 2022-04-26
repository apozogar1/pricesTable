package com.example.pricestable.services;

import java.time.LocalDateTime;

import com.example.pricestable.dto.PricesDto;

public interface PricesServices {

	PricesDto findPricesByStartDateAndProductIdAndbrandId(LocalDateTime startDate, Long productId,
			Long brandId);
}

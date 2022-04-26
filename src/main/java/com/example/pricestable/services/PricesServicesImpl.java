package com.example.pricestable.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pricestable.dto.PricesDto;
import com.example.pricestable.mapper.PricesMapper;
import com.example.pricestable.repository.model.PricesEntity;
import com.example.pricestable.repository.repository.PricesRepository;

@Service
public class PricesServicesImpl implements PricesServices {

	@Autowired
	private PricesRepository repository;

	@Autowired
	private PricesMapper mapper;

	@Override
	public PricesDto findPricesByStartDateAndProductIdAndbrandId(LocalDateTime startDate, Long productId,
			Long brandId) {
		List<PricesEntity> res = repository.findByPkStartDateAndPkProductIdAndBrandId(startDate, productId, brandId);
		Optional<PricesEntity> max = res.stream()
				.max((p1, p2) -> p1.getPk().getPriority().compareTo(p2.getPk().getPriority()));
		return max.isPresent() ? mapper.toDto(max.get()) : null;
	}

}

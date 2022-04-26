package com.example.pricestable.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.pricestable.dto.PricesDto;
import com.example.pricestable.repository.model.PricesEntity;

/**
 * The Interface DivisaMapper.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PricesMapper extends EntityMapper<PricesDto, PricesEntity> {

    @Mapping(source = "productId", target = "pk.productId")
    @Mapping(source = "priority", target = "pk.priority")
    @Mapping(source = "startDate", target = "pk.startDate")
	PricesEntity toEntity(PricesDto dto);

    @Mapping(target = "productId",source  = "pk.productId")
    @Mapping(target= "priority", source = "pk.priority")
    @Mapping(target = "startDate", source = "pk.startDate")
	PricesDto toDto(PricesEntity entity);

	List<PricesEntity> toEntity(List<PricesDto> dto);

	List<PricesDto> toDto(List<PricesEntity> entity);

}

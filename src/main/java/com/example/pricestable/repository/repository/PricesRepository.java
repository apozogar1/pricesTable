package com.example.pricestable.repository.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.pricestable.repository.model.PricesEntity;
import com.example.pricestable.repository.model.PricesPk;

@Repository("pricesRepo")
public interface PricesRepository
		extends JpaRepository<PricesEntity, PricesPk>, JpaSpecificationExecutor<PricesEntity> {

    /**
     * Find all.
     *
     * @param ru
     *            the ru
     * @param pageable
     *            the pageable
     * @return the page
     */
    @Query("    SELECT p "
            + " FROM PricesEntity p "
            + " WHERE p.pk.startDate <= :startDate and p.endDate >= :startDate "
            + "       and p.pk.productId = :productId "
            + "       and p.brandId = :brandId "
    )
	List<PricesEntity> findByPkStartDateAndPkProductIdAndBrandId(LocalDateTime startDate, Long productId,
			Long brandId);
}

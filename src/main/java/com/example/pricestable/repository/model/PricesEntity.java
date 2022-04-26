package com.example.pricestable.repository.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Accion de ejecucion Alberto IWOK
 *
 * @author
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRICES")
public class PricesEntity implements Serializable {

	private static final long serialVersionUID = -8345827326934903866L;

	/** The pk. */
	@EmbeddedId
	private PricesPk pk;

	/**
	 * Identificador de la tarifa de precios aplicable.
	 */
	@Column(name = "PRICE_LIST")
	private String priceList;

	/**
	 * rango de fechas en el que aplica el precio tarifa indicado.
	 */
	@Column(name = "END_DATE")
	private LocalDateTime endDate;

	/**
	 * Foreign key de la cadena del grupo (1 = ZARA).
	 */
	@Column(name = "BRAND_ID")
	private Long brandId;

	/**
	 * precio final de venta.
	 */
	@Column(name = "PRICE")
	private BigDecimal price;

	/**
	 * iso de la moneda.
	 */
	@Column(name = "CURR")
	private String curr;

}

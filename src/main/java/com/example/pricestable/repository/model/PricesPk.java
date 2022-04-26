package com.example.pricestable.repository.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class PricesPk implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 3772191407105760366L;

	/**
	 * Identificador código de producto.
	 */
	@Column(name = "PRODUCT_ID")
	private Long productId;

	/**
	 * Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago
	 * de fechas se aplica la de mayor prioridad (mayor valor numérico).
	 */
	@Column(name = "PRIORITY")
	private Long priority;

	/**
	 * rango de fechas en el que aplica el precio tarifa indicado.
	 */
	@Column(name = "START_DATE")
	private LocalDateTime startDate;

}

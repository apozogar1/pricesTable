package com.example.pricestable.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@AllArgsConstructor
@NoArgsConstructor
public class PricesDto implements Serializable {

	private static final long serialVersionUID = -8345827326934903866L;

	/**
	 * Identificador código de producto.
	 */
	private Long productId;

	/**
	 * Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago
	 * de fechas se aplica la de mayor prioridad (mayor valor numérico).
	 */
	private Long priority;

	/**
	 * rango de fechas en el que aplica el precio tarifa indicado.
	 */
	private LocalDateTime startDate;
	/**
	 * Identificador de la tarifa de precios aplicable.
	 */
	private String priceList;

	/**
	 * rango de fechas en el que aplica el precio tarifa indicado.
	 */
	private LocalDateTime endDate;

	/**
	 * Foreign key de la cadena del grupo (1 = ZARA).
	 */
	private Long brandId;

	/**
	 * precio final de venta.
	 */
	private BigDecimal price;

	/**
	 * iso de la moneda.
	 */
	private String curr;

}

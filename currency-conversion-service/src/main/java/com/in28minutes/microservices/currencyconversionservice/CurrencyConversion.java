package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;


//@Entity
public class CurrencyConversion {
	
	//@Id
	private Long id;
	
	//@Column(name= "currency_from")
	private String from;
	//@Column(name= "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalAmountCalculated;
	private String environment;
	
	public CurrencyConversion()
	{
		super();
	}
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,BigDecimal totalAmountCalculated,String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalAmountCalculated = totalAmountCalculated;
		this.environment =environment;
	}
	public BigDecimal getTotalAmountCalculated() {
		return totalAmountCalculated;
	}

	public void setTotalAmountCalculated(BigDecimal totalAmountCalculated) {
		this.totalAmountCalculated = totalAmountCalculated;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	

}

package com.cathaybk.interview.service;

import java.util.List;

import com.cathaybk.interview.entity.Currency;

public interface CurrencyService {
	
	public List<Currency> getAllCoinDesk() throws Exception;
	
	public Currency getCoinDeskById(String id) throws Exception;
	
	public Currency createCoinDesk(Currency coinDesk) throws Exception;
	
	public void deleteCoinDesk(String id) throws Exception;
	
}

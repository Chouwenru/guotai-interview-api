package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CoinDesk;

public interface CoinDeskService {
	
	public List<CoinDesk> getAllCoinDesk() throws Exception;
	
	public CoinDesk getCoinDeskById(String id) throws Exception;
	
	public CoinDesk createCoinDesk(CoinDesk coinDesk) throws Exception;
	
	public void deleteCoinDesk(String id) throws Exception;
	
}

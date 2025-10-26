package com.cathaybk.interview.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cathaybk.interview.entity.Currency;
import com.cathaybk.interview.service.CurrencyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

	@Override
	public List<Currency> getAllCoinDesk() {
		return null;
	};

	@Override
	public Currency getCoinDeskById(String id) {
		return null;
	};

	@Override
	public Currency createCoinDesk(Currency coinDesk) {
		return null;
	};

	@Override
	public void deleteCoinDesk(String id) {
		return;
	}

}

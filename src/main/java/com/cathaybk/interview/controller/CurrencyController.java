package com.cathaybk.interview.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cathaybk.interview.entity.Currency;
import com.cathaybk.interview.service.CurrencyService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("coin")
@RequiredArgsConstructor
public class CurrencyController {

    private final CurrencyService coinDeskService;

    @GetMapping
    public List<Currency> getAllCoinDesks() throws Exception {
        return coinDeskService.getAllCoinDesk();
    }

    @GetMapping("/{id}")
    public Currency getCoinDeskById(@PathVariable String id) throws Exception {
        return coinDeskService.getCoinDeskById(id);
    }

    @PostMapping
    public Currency createCoinDesk(@RequestBody Currency coinDesk) throws Exception {
        return coinDeskService.createCoinDesk(coinDesk);
    }

    @DeleteMapping("/{id}")
    public void deleteCoinDesk(@PathVariable String id) throws Exception {
        coinDeskService.deleteCoinDesk(id);
    }
}
package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CoinDesk;
import com.example.demo.service.CoinDeskService;


@RestController
@RequestMapping("/api/coin")

public class CoinDeskController {

    private final CoinDeskService coinDeskService;

    public CoinDeskController(CoinDeskService coinDeskService) {
        this.coinDeskService = coinDeskService;
    }

    @GetMapping
    public List<CoinDesk> getAllCoinDesks() throws Exception {
        return coinDeskService.getAllCoinDesk();
    }

    @GetMapping("/{id}")
    public CoinDesk getCoinDeskById(@PathVariable String id) throws Exception {
        return coinDeskService.getCoinDeskById(id);
    }

    @PostMapping
    public CoinDesk createCoinDesk(@RequestBody CoinDesk coinDesk) throws Exception {
        return coinDeskService.createCoinDesk(coinDesk);
    }

    @DeleteMapping("/{id}")
    public void deleteCoinDesk(@PathVariable String id) throws Exception {
        coinDeskService.deleteCoinDesk(id);
    }
}
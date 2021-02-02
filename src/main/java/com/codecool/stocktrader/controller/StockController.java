package com.codecool.stocktrader.controller;

import com.codecool.stocktrader.model.Stock;
import com.codecool.stocktrader.service.StockInfoStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

    @Autowired
    StockInfoStorage stockStorage;

    @GetMapping("/stocks")
    public List<Stock> getStocks() {
        return stockStorage.getStocks();
    }

    @GetMapping("/stocks/{name}")
    public Stock getOneStock(@PathVariable String name) {
        return stockStorage.getStockByName(name);
    }

    @PostMapping("/stocks")
    public Stock addStock(@RequestBody Stock stock) {
        return stockStorage.addStock(stock);
    }

    @PutMapping("/stocks/{name}")
    public Stock updateStock(@PathVariable("name") String name, @RequestBody Stock stock) {
        return stockStorage.updateStock(name, stock);
    }

    @DeleteMapping("/stocks")
    public void deleteStock(@RequestBody Stock stock) {
        stockStorage.deleteStock(stock);
    }
}

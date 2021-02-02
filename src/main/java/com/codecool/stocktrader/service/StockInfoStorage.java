package com.codecool.stocktrader.service;

import com.codecool.stocktrader.model.Stock;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockInfoStorage {

    private List<Stock> stocks = new ArrayList<>(Arrays.asList(
        new Stock("AAPL", 220.0),
        new Stock("GOOGL", 198.2),
        new Stock("AMZN", 232.4)
    ));

    public List<Stock> getStocks() {
        return stocks;
    }

    public Stock getStockByName(String name) {
        return stocks.stream()
            .filter(s -> s.getName().equals(name))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }

    public Stock addStock(Stock stock) {
        stocks.add(stock);
        return stock;
    }

    public Stock updateStock(String name, Stock stock) {
        Stock searchedStock = stocks.stream()
            .filter(s -> s.getName().equals(name))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);

        searchedStock.setPrice(stock.getPrice());
        searchedStock.setName(stock.getName());

        return searchedStock;
    }

    public void deleteStock(Stock stock) {
        stocks = stocks.stream()
            .filter(s -> !s.getName().equals(stock.getName()))
            .collect(Collectors.toList());
    }
}

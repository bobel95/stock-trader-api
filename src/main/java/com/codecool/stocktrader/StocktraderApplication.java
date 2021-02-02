package com.codecool.stocktrader;

import com.codecool.stocktrader.model.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StocktraderApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(StocktraderApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(StocktraderApplication.class, args);
    }

}

package com.codecool.stocktrader.config;

import com.codecool.stocktrader.service.StockInfoStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "stockStorage")
    public StockInfoStorage stockStorageCreator() {
        return new StockInfoStorage();
    }

}

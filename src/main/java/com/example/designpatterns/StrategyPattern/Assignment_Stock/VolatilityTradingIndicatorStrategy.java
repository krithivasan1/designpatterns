package com.example.designpatterns.StrategyPattern.Assignment_Stock;

public class VolatilityTradingIndicatorStrategy implements TradingIndicatorStrategy{
    @Override
    public  TradingStrategyType supportsType(){
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double  calculate(Stock stock){

        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}

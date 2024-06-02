package com.example.designpatterns.StrategyPattern.Assignment_Stock;

public class MomentumTradingIndicatorStrategy implements TradingIndicatorStrategy{
    @Override
    public   TradingStrategyType supportsType(){
        return TradingStrategyType.MOMENTUM;

    }
    @Override
    public Double  calculate(Stock stock){

        return stock.getPrice() - stock.getPreviousPrice();
    }
}

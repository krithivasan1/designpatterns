package com.example.designpatterns.StrategyPattern.Assignment_Stock;


public class MovingAverageTradingIndicatorStrategy implements TradingIndicatorStrategy{
    @Override
    public  TradingStrategyType supportsType(){
        return TradingStrategyType.MOVING_AVERAGES;

    }
    @Override
    public Double  calculate(Stock stock) {

        return (stock.getPrice() + stock.getPreviousPrice()) / 2;


    }
}
package com.example.designpatterns.StrategyPattern.Assignment_Stock;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    Double calculate(Stock stock);
}

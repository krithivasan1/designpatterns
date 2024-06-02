package com.example.designpatterns.StrategyPattern.Assignment_Stock;

public class StockTradingManager {

    private TradingStrategyType strategyType;
    private TradingIndicatorStrategy  tradingIndicatorStrategy;

    public StockTradingManager(TradingStrategyType strategyType) {
        this.strategyType = strategyType;
    }

    public StockTradingManager(TradingIndicatorStrategy  tradingIndicatorStrategy ) {
        this.tradingIndicatorStrategy  = tradingIndicatorStrategy ;
    }

    public Double calculateIndicator(Stock stock) {

     /*   switch (strategyType) {
            case MOVING_AVERAGES:
                return (stock.getPrice() + stock.getPreviousPrice()) / 2;
                return new MovingAverageTrading
            case MOMENTUM:
                return stock.getPrice() - stock.getPreviousPrice();
            case VOLATILITY:
                return Math.abs(stock.getPrice() - stock.getPreviousPrice());
        }
        throw new RuntimeException("Invalid strategy type");
        */
        return tradingIndicatorStrategy.calculate(stock);
    }
}
package com.example.designpatterns.AdapterDesignPattern;

import com.example.designpatterns.AdapterDesignPattern.thirdpartyBank.ICICIBank;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("ICICIAdapter")
@Component
public class ICICIAdapter implements BankAPI{

    ICICIBank iciciBank = new ICICIBank();
    @Override
    public void sendMoney(String source, String destination, double amount) {
        iciciBank.sendMoney(source,destination,amount);

    }
}

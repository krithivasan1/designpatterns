package com.example.designpatterns.AdapterDesignPattern;

import com.example.designpatterns.AdapterDesignPattern.thirdpartyBank.YesBank;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("YesBankAdapter")
@Component
public class YesBankAdapter implements BankAPI{
    YesBank yesBank = new YesBank();
    @Override
    public void sendMoney(String source, String destination, double amount) {
        yesBank.sendMoney(source,destination,amount);
    }
}

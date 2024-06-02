package com.example.designpatterns.AdapterDesignPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PhonePeClient {

    public BankAPI bankAPI;

    @Autowired
    PhonePeClient(@Qualifier("YesBankAdapter")BankAPI bankAPI){
        this.bankAPI=bankAPI;
    }

    public void sendMoney(String source, String destination,double amount){
        bankAPI.sendMoney(source,destination,amount);
    }
    public static void main(String args[]){
        //BankAPI bankAPI = new YesBankAdapter();
       // BankAPI bankAPI = new ICICIAdapter();
       // PhonePeClient phonePeClient = new PhonePeClient(bankAPI);
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        PhonePeClient phonePeClient = context.getBean(PhonePeClient.class);
        phonePeClient.sendMoney("Krithi","Deepak",10000);

    }
}

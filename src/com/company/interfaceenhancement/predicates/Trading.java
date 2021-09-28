package com.company.interfaceenhancement.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Trading {
    
    static ArrayList<Stock> stocks = new ArrayList<>();
    Stock stock = null;

    public static void main(String[] args){
        Stock stockToSearch = new Stock("fb",400,32);

        stocks.add(new Stock("Apple", 500, 22));
        stocks.add(new Stock("fb", 400, 32));
        stocks.add(new Stock("google", 600, 50));

        Predicate<Stock> stockEquality = Predicate.isEqual(stockToSearch);

        for (Stock s: stocks){
            if (stockEquality.test(s)){
                System.out.println("stock found: "+s);
            }
        }

    }
}

package com.company.interfaceenhancement.predicates;

public class Stock {
    String name;
    Integer stockPrice;
    Integer stockQyt;

    public Stock(String name, Integer stockPrice,Integer stockQyt){
        this.name = name;
        this.stockPrice =stockPrice;
        this.stockQyt = stockQyt;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+"Price: "+this.stockPrice+"Qty: "+this.stockQyt;
    }

    @Override
    public boolean equals(Object object){
        Stock stock = (Stock) object;

        if (name.equals(stock.name) &&
                stockPrice.equals(stock.stockPrice)
                && stockQyt.equals(stock.stockQyt) ) {
            return true;
        }
        else return false;
    }
}

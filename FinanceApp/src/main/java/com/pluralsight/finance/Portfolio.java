package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<Valuable>();
    }

    public void add(Valuable item) {
        valuables.add(item);
    }

    public double getValue() {
        double total = 0;
        for (Valuable item : valuables) {
            total += item.getValue();
        }
        return total;
    }
}

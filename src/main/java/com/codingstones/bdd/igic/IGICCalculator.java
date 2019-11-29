package com.codingstones.bdd.igic;

public class IGICCalculator {
    public float calculateTotal(String product, int price) {
        // 0 type
        if (product.equals("medicine")) return (float) (price);
        // reduced type
        if (product.equals("bread")) return (float) (price * 1.03);
        // general type
        if (product.equals("fruit")) return (float) (price * 1.07);
        // incremented type
        if (product.equals("wine")) return (float) (price * 1.12);
        // special types
        if (product.equals("diapers")) return (float) (price * 1.20);
        return -1;
    }
}

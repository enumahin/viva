package com.alienworkspace.ems.ch04;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CommodityFactory {

    public static Map<String, Supplier<? extends Commodity>> commodities = new HashMap<>();

    static {
        commodities.put("gold", Gold::new);
        commodities.put("crudeoil", CrudeOil::new);
        commodities.put("soy", () -> new Soybean());
    }


    public static void registerNewCommodity(String type, Supplier<? extends Commodity> supplier) {
        commodities.put(type, supplier);
    }

    public static Commodity getCommodity(String typeOfCommodity) {
        Supplier<? extends Commodity> commoditySupplier = commodities.get(typeOfCommodity);
        if(null != commoditySupplier) {
            return commoditySupplier.get();
        }
        throw new IllegalArgumentException("Unknown Commodity: " + typeOfCommodity);
    }
}

interface Commodity{

    public void buy();
}

class CrudeOil implements Commodity{

    @Override
    public void buy() {
        System.out.println("Buying crude oil......");
    }
}

class Gold implements Commodity{

    @Override
    public void buy() {
        System.out.println("Buying gold......");
    }
}

class Soybean implements Commodity{

    @Override
    public void buy() {
        System.out.println("Buying soybean......");
    }
}
package com.alienworkspace.ems.ch04;

public class MultiCommodityExchange {

    public static void main(String[] args) {
        MultiCommodityExchange market = new MultiCommodityExchange();
        market.trade();
    }

    private void trade() {
        Commodity commodity = CommodityFactory.getCommodity(getTypeOfCommodity());
//        String type = getTypeOfCommodity();
//        if (type.equals("gold")){
//            commodity = new Gold();
//        }else if (type.equals("soy")){
//            commodity = new Soybean();
//        }else if (type.equals("crudeoil")){
//            commodity = new CrudeOil();
//        }
//        assert commodity != null;
        commodity.buy();
    }

    private String getTypeOfCommodity() {
        // can return other values as well...
        return "gold";
    }
}

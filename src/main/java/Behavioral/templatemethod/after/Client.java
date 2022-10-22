package Behavioral.templatemethod.after;

import Behavioral.templatemethod.after.beverage.CaffeineBeverage;
import Behavioral.templatemethod.after.beverage.Coffee;

public class Client {
    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();
        beverage.prepareRecipe();
    }
}

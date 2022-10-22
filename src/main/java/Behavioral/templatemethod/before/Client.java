package Behavioral.templatemethod.before;

public class Client {
    public static void main(String[] args) {
        new Coffee().prepareRecipe();
        new Tea().prepareRecipe();
    }
}

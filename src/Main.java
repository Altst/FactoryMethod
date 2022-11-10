public class Main {
    public static void main(String[] args) {
        CoffeeMachines coffeeMachines = new CoffeeMachines();

        CoffeeMan beans = coffeeMachines.create("Beans");
        CoffeeMan capsules = coffeeMachines.create("Capsules");
        CoffeeMan granules = coffeeMachines.create("Granules");
        CoffeeMan latte = coffeeMachines.create("Latte");
        CoffeeMan americano = coffeeMachines.create("Americano");
        CoffeeMan rafe = coffeeMachines.create("Rafe");

        beans.coffee();
        latte.coffee();
        capsules.coffee();
        americano.coffee();
        granules.coffee();
        rafe.coffee();
    }
}
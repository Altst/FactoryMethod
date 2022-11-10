class CoffeeMachines {
    public CoffeeMan create(String typeOfRefill){
        switch (typeOfRefill){
            case "Beans" : return new Beans();
            case "Capsules" : return new Capsules();
            case "Granules" : return new Granules();
            case "Latte" : return new Latte();
            case "Americano" : return new Americano();
            case "Rafe" : return new Rafe();
            default: return null;
        }
    }
}

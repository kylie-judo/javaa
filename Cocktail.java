public class Cocktail {
    
    String name;
    boolean isIced;

    public Cocktail(String name) {
        this.name = "sex on the Beach";
        this.isIced = true;
    }

    public void serve() {
        System.out.println("Serving a cold " + "sex on the Beach"+ "!");
    }
}

// In your main method:
// Cocktail drink = new Cocktail("Sex on the Beach");
// drink.serve();


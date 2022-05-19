package pl.click;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic",
                1.66,"wheat","Sausage");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("tomato",0.27);
        hamburger.addHamburgerAddition2("lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        hamburger.addHamburgerAddition4("Onion",5.71);


        System.out.println(" Total burger price is "+ hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(10,"Bacon");
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("egg",2.33);
        healthyBurger.addHealthAddition2("spinach",1.00);

        System.out.println(" Total burger price is "+ healthyBurger.itemizeHamburger());
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        deluxeHamburger.itemizeHamburger();
        deluxeHamburger.addHamburgerAddition3("Should not do this", 50.53);
        deluxeHamburger.itemizeHamburger();








    }
}

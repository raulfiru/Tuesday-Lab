package com.haufe.cookbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        SquarePizza newPizza = new SquarePizza();

        newPizza.setCrust("crunchy");

        newPizza.SetDiameter(100);

        System.out.println(newPizza.getCrust());

        newPizza.PizzaIsOutofStock();

        System.out.println(newPizza.getInStock());

        SmallPizza otherPizza = new SmallPizza();

        System.out.println(otherPizza.PizzaArea());

//        ((Pizza)otherPizza).PizzaIsOutofStock();

        // otherPizza.PizzaIsOutofStock();

        Pizza biggerPizza = Pizza.ComparePizzas(newPizza,otherPizza);

        System.out.println(biggerPizza.PizzaArea());

    }
}

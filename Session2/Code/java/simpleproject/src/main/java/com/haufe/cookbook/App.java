package com.haufe.cookbook;

import com.haufe.cookbook.ingredients.Ingredient;
import com.haufe.cookbook.ingredients.Mushrooms;
import com.haufe.cookbook.ingredients.Salami;
import com.haufe.cookbook.ingredients.Tomatos;

import java.io.Console;
import java.util.Iterator;

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


        newPizza.addIngredient(new Salami());
        newPizza.addIngredient(new Mushrooms());
        newPizza.addIngredient(new Tomatos());
        Iterator it = newPizza.getIngredients().iterator();
        while(it.hasNext()){
            System.out.println(((Food)it.next()).WhatAmI());
        }
        System.out.println(newPizza.Cost());

        newPizza.addIngredientToMap(new Salami(),"Salami");
        newPizza.addIngredientToMap(new Mushrooms(),"Mushrooms");
        newPizza.addIngredientToMap(new Tomatos(),"Tomatoes");
        Iterator it2 = newPizza.getIngredientsMap().keySet().iterator();
        while(it2.hasNext()){
            String key = (String)it2.next();
            Food value = (Food)newPizza.getIngredientsMap().get(key);
            System.out.println(value.WhatAmI());
        }

        System.out.println(newPizza.Cost());


        SmallPizza otherPizza = new SmallPizza();

        System.out.println(otherPizza.PizzaArea());

        Pizza biggerPizza = Pizza.ComparePizzas(newPizza,otherPizza);

        System.out.println(biggerPizza.PizzaArea());

    }
}

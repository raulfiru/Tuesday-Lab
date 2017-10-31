package com.haufe.cookbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.haufe.cookbook.ingredients.*;

public abstract class Pizza implements Food {

    private String crust;
    private boolean inStock = true;

    private ArrayList ingredients = new ArrayList();
    public Ingredient getIngredient(int index){
        return (Ingredient)this.ingredients.get(index);
    }
    public ArrayList getIngredients() {
        return ingredients;
    }
    public void addIngredient(Ingredient ing)
    {
        this.ingredients.add(ing);
    }
    public int Cost()
    {
        int cost = 0;
        Iterator it = ingredients.iterator();
        while(it.hasNext()){
            Ingredient value = (Ingredient) it.next();
            cost =  cost + value.Cost();
        }

        return cost;
    }

    private HashMap ingredientsMap = new HashMap();
    public Ingredient getIngredientBasedOnMap(String key){
        return (Ingredient)this.ingredientsMap.get(key);
    }
    public HashMap getIngredientsMap() {
        return ingredientsMap;
    }
    public void addIngredientToMap(Ingredient ing, String key)
    {
        this.ingredientsMap.put(key, ing);
    }
    public int CostBasedOnMap()
    {
        int cost = 0;
        Iterator it = ingredientsMap.keySet().iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            Ingredient value = (Ingredient)ingredientsMap.get(key);
            cost =  cost + value.Cost();
        }

        return cost;
    }

    protected int diameter;

    public String getCrust(){
        return this.crust;
    }

    public void SetDiameter(int value){
        diameter = value;
    }

    public boolean getInStock(){
        return this.inStock;
    }

    public void setCrust(String newValue)
    {
        this.crust = newValue;
    }

    public void PizzaIsOutofStock() throws Exception
    {
        inStock = false;
    }

    public abstract double PizzaArea();

    public static Pizza ComparePizzas(Pizza p1, Pizza p2){
        if (p1.PizzaArea()>=p2.PizzaArea()){
            return p1;
        }
        else{
            return p2;
        }
    }

    //Interface Methods
    public String WhatAmI()
    {
        return "Pizza";
    }

    public boolean EatableRaw()
    {
        return false;
    }
}

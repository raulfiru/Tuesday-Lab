package com.haufe.cookbook;

public abstract class Pizza implements Food {

    private String crust;
    private boolean inStock = true;

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

    public void setCrust(String newValue){
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

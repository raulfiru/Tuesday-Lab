package com.haufe.cookbook;

public class SmallPizza extends Pizza {
    String owner;

    public SmallPizza(){
        this.diameter = 11;
    }

    public void SendtoCustomer(String customer){
        owner = customer;
    }

    public String GetOwner(){
        return owner;
    }

    public double PizzaArea()
    {
        return  (3.14/4) * (diameter*diameter);
    }

    public void PizzaIsOutofStock() throws Exception
    {
        throw new Exception("not allowed");
    }
}

package com.haufe.cookbook.ingredients;
import com.haufe.cookbook.*;

public class Mushrooms implements Ingredient, Food {
    public int Cost(){
        return 7;
    }

    public String toString()
    {
        return "Mushrooms";
    }

    public String WhatAmI(){
        return "Mushrooms";
    }

    public boolean EatableRaw(){
        return false;
    }
}

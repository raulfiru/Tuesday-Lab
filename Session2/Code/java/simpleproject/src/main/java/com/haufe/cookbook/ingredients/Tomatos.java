package com.haufe.cookbook.ingredients;

import com.haufe.cookbook.Food;

public class Tomatos implements Ingredient, Food {
    public int Cost(){
        return 8;
    }

    public String toString() {
        return "Tomatos";
    }

    public String WhatAmI(){
        return "Tomatos";
    }

    public boolean EatableRaw(){
        return false;
    }
}

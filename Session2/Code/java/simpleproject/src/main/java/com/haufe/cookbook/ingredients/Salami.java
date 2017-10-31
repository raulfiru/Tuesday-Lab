package com.haufe.cookbook.ingredients;

import com.haufe.cookbook.Food;

public class Salami implements Ingredient, Food {
    public int Cost(){
        return 6;
    }

    public String toString() {
        return "Salami";
    }

    public String WhatAmI(){
        return "Salami";
    }

    public boolean EatableRaw(){
        return true;
    }
}

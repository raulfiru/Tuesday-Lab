package com.haufe.cookbook.ingredients;

import com.haufe.cookbook.Food;

public class Corn implements Ingredient, Food {
    public int Cost(){
        return 5;
    }

    public String toString() {
        return "Corn";
    }

    public String WhatAmI(){
        return "Corn";
    }

    public boolean EatableRaw(){
        return false;
    }
}

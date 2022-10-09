package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(isVeg){
            total+=70;
        }
        else{
            total+=120;
        }
        total+=80;
    }
}

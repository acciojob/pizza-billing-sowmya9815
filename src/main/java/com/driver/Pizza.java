package com.driver;

public class Pizza {
    public int total = 0;
    public boolean eCheese = false;
    public boolean eTopping = false;
    public boolean bag = false;

    private int price;
    private Boolean isVeg;
    private String bill;

    public void setIsVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            setPrice(300);
        }
        else {
            setPrice(400);
        }
        total = price;
        setBill("Base Price Of The Pizza: "+price+"\n");

    }

    public int getPrice(){
        return this.total;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!eCheese) {
            total += 80;
            setBill(bill+"Extra Cheese Added: 80"+"\n");
            eCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!eTopping) {
            if (isVeg) {
                total += 70;
                setBill(bill+"Extra Toppings Added: 70"+"\n");
            }
            else {
                total += 120;
                setBill(bill+"Extra Toppings Added: 120"+"\n");
            }
        }
        eTopping = true;
    }

    public void addTakeaway(){
        // your code goes here
        if (!bag) {
            total += 20;
            setBill(bill+"Paperbag Added: 20"+"\n");
            bag = true;
        }

    }

    public String getBill(){
        // your code goes here
        setBill(bill+"Total Price: "+total);
        return this.bill;
    }
}

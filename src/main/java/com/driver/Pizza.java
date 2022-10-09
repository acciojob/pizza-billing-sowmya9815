package com.driver;

public class Pizza {

    private int price;

    int total=0;

    private boolean et = false;
    private boolean ec = false;

    private boolean ta = false;



    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        //this.total=price;
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ec){
            this.total+=80;
        }
        ec = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!et){
            if(isVeg){
                this.total+=70;
            }
            else{
                this.total+=120;
            }
        }
        et=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!ta){
            this.total+=20;
        }
        ta=true;

    }

    public String getBill(){
        // your code goes here
        bill="";
        if(isVeg){
            bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            bill+="Base Price Of The Pizza: 400\n";
        }
        if(ec) {
            bill += "Extra Cheese Added: 80\n";
        }
        if(et) {
            if (isVeg) {
                bill += "Extra Toppings Added: 70\n";
            } else {
                bill += "Extra Toppings Added: 120\n";
            }
        }

        if(ta){
            bill+="Paperbag Added: 20\n";
        }
        bill+= "Total Price: "+ (price+total);
        return this.bill;
    }
}

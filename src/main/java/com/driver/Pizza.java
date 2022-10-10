package com.driver;

public class Pizza {
    private int price;
    private boolean et;
    private boolean ec;
    private final int extracp;
    private final int takeaway;
    private final int extratoppingprice;
    private boolean ta;
    private boolean isBillAdded;




    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        et=false;
        ec=false;
        ta=false;
        isBillAdded=false;
        this.extracp=80;
        this.takeaway=20;
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price = 300;
            this.extratoppingprice=70;
        }
        else{
            this.price += 400;
            this.extratoppingprice=120;
        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ec){
            this.price = this.price + this.extracp ;
            ec = true;
        }
        
    }

    public void addExtraToppings(){
        // your code goes here
        if(!et){
            this.price = this.price + this.extratoppingprice ;
            et=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!ta){
            this.price = this.price + this.takeaway;
            ta=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(isBillAdded==false) {
            isBillAdded=true;
            if (ec) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extracp + "\n";
            }
            if (et) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extratoppingprice + "\n";
            }

            if (ta) {
                this.bill = this.bill + "Paperbag Added: " + this.takeaway + "\n";
            }
            this.bill = this.bill + "Total Price: " + getPrice() + "\n";
        }

        return this.bill;
    }
}

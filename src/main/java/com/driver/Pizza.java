package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isbillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;
        // your code goes here
        if(isVeg==true)
        {
            this.price =300;
            this.toppingsPrice = 70;
        }
        else {
            this.price =400;
            this.toppingsPrice =120;
        }
        this.isCheeseAdded =false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isbillGenerated = false;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false)
        {
            this.price = this.price+cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false)
        {
            this.price = this.price+toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded ==false)
        {
            this.price = this.price+takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
       if(isbillGenerated==false)
       {
           if(isCheeseAdded==true)
               this.bill = this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
           if(isToppingsAdded==true)
               this.bill = this.bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";
           if(isTakeAwayAdded==true)
               this.bill = this.bill+"Paperbag Added: 20\n";
           this.bill = this.bill+"Total Price: "+this.price+"\n";
           isbillGenerated = true;
       }
        return this.bill;
    }
}

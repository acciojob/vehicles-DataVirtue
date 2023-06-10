package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,isManual);

    }
    private int getGear(int speed){
        if(speed>=0 && speed<=50)
            return 1;
        if(speed>=51 && speed<=100)
            return 2;
        if(speed>=101 && speed<=150)
            return 3;
        if(speed>=151 && speed<=200)
            return 4;
        if(speed>=201 && speed<=250)
            return 5;
        else
            return 6;
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            this.stop();
            this.changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            this.changeGear(getGear(newSpeed));
        }
    }
}

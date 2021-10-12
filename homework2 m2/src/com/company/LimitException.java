package com.company;

/**
 * Created by User on 13.10.2021.
 */
public class LimitException extends Exception {

public double remainingAmount;


    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public  double getRemainingAmount(){
         return remainingAmount;
     }
}

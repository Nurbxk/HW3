package com.company;

/**
 * Created by User on 13.10.2021.
 */
public class BankAccount {
    double amount;

    public double getAmount() {
        return  amount;}
        public void deposit(double sum){
        amount += sum; }
    public void withDraw(int sum) throws LimitException {
        if(sum > amount){
            throw new LimitException("Недостаточно средств. На вашем балансе : " + amount, amount);
        } else{
            amount = (int)amount - sum ;}


    }


}


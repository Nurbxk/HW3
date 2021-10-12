package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
 BankAccount account1 = new BankAccount();
account1.deposit(15000);
        System.out.println(account1.getAmount());

    while(true){
      try {
          account1.withDraw(6000);
          account1.amount -= 6000;
      }catch (LimitException lim) {
          System.out.println(lim.getMessage());
          System.out.println("Осталось  " + account1.getAmount());
          System.out.println("Были сняты последние деньги. Ваш баланс : " );
          System.out.println( account1.getAmount() - 3000);
         break;



      }
    }


    }
}

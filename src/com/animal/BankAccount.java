package com.animal;

public class BankAccount {
    private double  amount;
public void deposit(double sum){
    this.amount +=sum;

}public void withDraw(double sum) {
    try {
        if (this.amount < sum) {
            throw new LimitException("Akca az", amount);


        } else {
            this.amount -= sum;
            System.out.println("akca aldyn: " + sum);
            System.out.println("shotto: " + amount);
        }
    }catch (LimitException e){
        System.out.println(e.getMessage());
        System.out.println("ostatok:"+e.getMessage());
        System.exit(0);
    }
}
}

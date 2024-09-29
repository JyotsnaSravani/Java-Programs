import java.util.*;

abstract class Bank {
    abstract double getBalance(); 
}

BankA extends Bank {
    private double balance = 100; 
    double getBalance() {
        return balance;
    }
}

BankB extends Bank {
    private double balance = 150; 
    double getBalance() {
        return balance;
    }
}

BankC extends Bank {
    private double balance = 200; 
    double getBalance() {
        return balance;
    }
}

 public class BankAbstractEx {
    public static void main(String[] args) {
        BankA a = new BankA();
        System.out.println("Balance in bank A = $" + a.getBalance()); 
        BankB b = new BankB();
        System.out.println("Balance in bank B = $" + b.getBalance()); 
        BankC c = new BankC();
        System.out.println("Balance in bank C = $" + c.getBalance()); 
    }
}
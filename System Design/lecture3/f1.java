import java.io.*;
import java.util.*;
  public class f1 {
        
      
       static class BankAccount {
          int anum;
          int money;
          static int roi;
    
          BankAccount( BankAccount o){
            this.anum = o.anum;
            this.money = o.money;
          }
    
          void announce(){
            int anum = 10;
    
            System.out.println(anum + ", " + this.money + ", " + this.roi);
          }
    
          static void decreaseROI(){
            roi--;
            // anum and money can't be used
            // announce(); // not allowed
    
            // what is allowed
            BankAccount a = new BankAccount();
            a.announce();
    
    
            BankAccount b = a;
          }
      }
      
      
        
      public static void main(String[] args) throws NumberFormatException, IOException {
          BankAccount a1 = new BankAccount();
          a1.anum = 10;
          a1.money = 100;
          a1.roi = 4; // bad practice (static data members should be modified using class and not object)
          BankAccount.roi = 5;
    
          a1.announce();
    
          BankAccount a2 = new BankAccount();
          a2.anum = 11;
          a2.money = 110;
          a2.roi = 5;
        
          a2.announce();
          a1.announce();
    
          BankAccount.decreaseROI();
      }
    
    
    }
    


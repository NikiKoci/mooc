/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

/**
 *
 * @author Niki
 */
public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        cashInRegister=1000;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.5) {
            economicalSold++;
            cashInRegister+=2.5;
            return cashGiven-2.5;
        }
        else return cashGiven;
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
    }

    public double payGourmet(double cashGiven) {
   if(cashGiven>=4) {
           gourmetSold++;
            cashInRegister+=4;
            return cashGiven-4;
        }
   
   else return cashGiven;
    }
  public boolean payEconomical(LyyraCard card) {
    double  price = 2.5;
        if(card.balance()>=price) {
             economicalSold++;
             card.pay(price);
            return true;
            
        }
        else return false;
    }

    public boolean payGourmet(LyyraCard card) {
      double  price = 4;
        if(card.balance()>=price) {
             gourmetSold++;
             card.pay(price);
            return true;
            
        }
        else return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
   card.loadMoney(sum);
   cashInRegister+=sum;
}
    
    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
  
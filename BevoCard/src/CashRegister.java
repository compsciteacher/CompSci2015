public class CashRegister {
 
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    // Javassa vakio määritellään näin
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.0;
 
    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }
 
    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        // if not enough money given, all is returned and nothing else happens       
        if (cashGiven < PRICE_OF_ECONOMICAL) {
            return cashGiven;
        }
 
        this.cashInRegister += PRICE_OF_ECONOMICAL;
        this.economicalSold++;
        return cashGiven - PRICE_OF_ECONOMICAL;
    }
 
    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven < PRICE_OF_GOURMET) {
            return cashGiven;
        }
 
        this.cashInRegister += PRICE_OF_GOURMET;
        this.gourmetSold++;
        return cashGiven - PRICE_OF_GOURMET;
    }
 
    public boolean payEconomical(BevoCard card) {
        if (card.balance() < PRICE_OF_ECONOMICAL) {
            return false;
        }
 
        card.pay(PRICE_OF_ECONOMICAL);
        this.economicalSold++;
        return true;
    }
 
    public boolean payGourmet(BevoCard card) {
        if (card.balance() < PRICE_OF_GOURMET) {
            return false;
        }
 
        card.pay(PRICE_OF_GOURMET);
        this.gourmetSold++;
        return true;
    }
 
    public void loadMoneyToCard(BevoCard card, double sum) {
        if (sum < 0) {
            return;
        }
 
        card.loadMoney(sum);
        this.cashInRegister += sum;
    }
 
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
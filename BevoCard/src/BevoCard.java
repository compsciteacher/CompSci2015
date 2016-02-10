public class BevoCard {
 
    private double balance;
 
    public BevoCard(double balance) {
        this.balance = balance;
    }
 
    public double balance() {
        return this.balance;
    }
 
    public void loadMoney(double amount) {
        this.balance += amount;
    }
 
    public boolean pay(double amount) {
       // method checks if the balance of the card is at least amount given as parameter
       // if not, methods returns false meaning that the card could not be used for the payment
       // if the balance is enough, the given amount is taken from the balance and true is returned
        if (this.balance < amount) {
            return false;               
        }
         
        this.balance -= amount;
         
        return true;
    }
}
public class StoreMethods {
  // instance fields
  String productType;
  double price;
  // constructor method
  public StoreMethods(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  /*
  advertise method
  public means other classes can access the method
  The void keyword (which means “completely empty”) indicates to the method
  that no value is returned after calling that method.
  */
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }

  // getPriceWithTax Method
  // instead of using void you can use any datatype.
  public double getPriceWithTax(){
    double totalPrice = price + price * 0.08;
    // need an explicit return statement
    return totalPrice;
  }

  // greet customer method
  public void greetCustomer(String customer) {
    System.out.println("Welcome to the store, " + customer + "!");
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // toString Method
  // This is a common way to print out the details of an object instead of the Store89013890
  public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  // main method
  public static void main(String[] args) {
    StoreMethods lemonadeStand = new StoreMethods("Lemonade", 3.75);
    lemonadeStand.advertise();
    lemonadeStand.greetCustomer("Nathan");
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
    // sets the price with tax
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    // prints the price with tax
    System.out.println(lemonadePrice);
    System.out.println(lemonadeStand);
  }
}

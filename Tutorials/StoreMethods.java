public class StoreMethods {
  // instance fields
  String productType;
  double price;
  // constructor method
  public StoreMethods(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // advertise method
  // public means other classes can access the method
  // void means there is no specific output from the method.
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
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

  // main method
  public static void main(String[] args) {
    StoreMethods lemonadeStand = new StoreMethods("Lemonade", 3.75);
    lemonadeStand.advertise();
    lemonadeStand.greetCustomer("Nathan");
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
  }
}

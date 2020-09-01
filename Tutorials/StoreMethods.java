public class StoreMethods {
  // instance fields
  String productType;

  // constructor method
  public StoreMethods(String product) {
    productType = product;
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

  // main method
  public static void main(String[] args) {
    StoreMethods lemonadeStand = new StoreMethods("Lemonade");
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.greetCustomer("Nathan");
  }
}

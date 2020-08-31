public class Store {

  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");
  }

  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    // create the instance of store below
    Store lemonadeStand = new Store();
    // print the instance of store below
    System.out.println(lemonadeStand);
  }
}

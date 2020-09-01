public class StoreMethods {
  // instance fields
  String productType;

  // constructor method
  public Store(String product) {
    productType = product;
  }

  // advertise method
  // public means other classes can access the method
  // void means there is no specific output from the method. 
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }
  // main method
  public static void main(String[] args) {

  }
}

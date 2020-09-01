public class SavingsAccount {

  int balance;

  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  public int withdraw(int amountToWithdraw){
    int newBalance = balance - amountToWithdraw;
    balance = newBalance;
    return amountToWithdraw;
  }

  public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    savings.checkBalance();

    //Withdrawing:
    System.out.println("You just withdrew "+savings.withdraw(400));

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(200);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(200);

    //Check balance:
    savings.checkBalance();
  }
}

class AccountDemo
{
   public static void main(String[] args)
   {
   //Creating a savings account
      SavingsAccount sa = new SavingsAccount(10000);
      System.out.println("account name: " + sa.getName());
      System.out.println("initial amount: " + sa.getAmount());
      sa.deposit(5000);
      System.out.println("new amount after deposit: " + sa.getAmount());

   //Creating a checking account
      CheckingAccount ca = new CheckingAccount(20000);
      System.out.println("account name: " + ca.getName());
      System.out.println("initial amount: " + ca.getAmount());
      ca.deposit(6000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(3000);
      System.out.println("new amount after withdrawal: " + ca.getAmount());
   }
 }
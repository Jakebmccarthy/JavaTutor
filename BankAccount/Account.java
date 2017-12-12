class Account
{
   private String name;
   private long amount;

//Constructer method - used to create a default account
   Account(String name, long amount)
   {
      this.name = name;
      setAmount(amount);
   }

   void deposit(long amount)
   {
      this.amount += amount;
   }

   String getName()
   {
      return name;
   }

   long getAmount()
   {
      return amount;
   }

   void setAmount(long amount)
   {
      this.amount = amount;
   }
}
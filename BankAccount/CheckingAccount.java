class CheckingAccount extends Account
{
//checking account class inherits from the account parent class
   CheckingAccount(long amount)
   {
    //super()is used to invoke class contructor in parent class ---In this case to use amount which is in Account parent class
      super("checking", amount);
   }

   void withdraw(long amount)
   {
      setAmount(getAmount() - amount);
   }
}
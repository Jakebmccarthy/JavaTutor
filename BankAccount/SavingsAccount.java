class SavingsAccount extends Account
{
//savings account inherits from account parent class
   SavingsAccount(long amount)
   {
   //super()is used to invoke class contructor in parent class {In this case to use amount which is in Account parent class}
      super("savings", amount);
   }
}
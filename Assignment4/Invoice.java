public class Invoice{

   public int ID;
   public int amountOwed;
   public customer customerA;
   
   public void Invoice(){
      this.ID = 00;
      this.amountOwed = 0;
   }
   
   public void summariseInvoice(){
      System.out.println("Invoice Summary");
      System.out.println("_______________");
      System.out.println(this.ID);
      System.out.println(this.amountOwed);
      System.out.println(this.customerA);

   }
   
   public void calculateTax(){
     double taxOwed;
     taxOwed = this.amountOwed*.23;
     System.out.println("Tax Summary");
     System.out.println("_________");
     System.out.println(taxOwed);

   
   }
}
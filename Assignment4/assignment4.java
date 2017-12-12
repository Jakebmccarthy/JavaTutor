public class assignment4 {

   public static void main(String[] args){
     
     Invoice invoice1 = new Invoice();
     invoice1.ID=1;
     invoice1.amountOwed=1;
     
     invoice1.summariseInvoice();
     invoice1.calculateTax();

   }
}
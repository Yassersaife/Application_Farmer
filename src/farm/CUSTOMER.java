/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ADMIN
 */
public class CUSTOMER {
    private String FCname;
    private String LCname;
    private int IDcustomer;
    private String Address;
        private String CardInfo;
 private int ShippingID;
   private String ProductList;
   private double balance;
 
   public void setbalance(double x){
       this.balance=x;
   }
   public double getblance( ){
       return this.balance;
   }
       public void setIDcustomer( int x){
            this.IDcustomer=x;
        }
         public int getIDcustomer( ){
           return this.IDcustomer;
        }
    public void setFCname( String x){
            this.FCname=x;
        }
         public String getFCname( ){
           return this.FCname;
        }
   public void setLCname( String x){
            this.LCname=x;
        }
         public String getLCname( ){
           return this.LCname;
        }
    public void setAddress( String x){
            this.Address=x;
        }
         public String getAddress( ){
           return this.Address;
        }
    public void setCardInfo( String x){
            this.CardInfo=x;
        }
         public String getCardInfo( ){
           return this.CardInfo;
        }
    public void setShippingID( int x){
            this.ShippingID=x;
        }
         public int getShippingID( ){
           return this.ShippingID;
        }
      public void setProductList( String x){
            this.ProductList=x;
        }
         public String getProductList( ){
           return this.ProductList;
        }
}

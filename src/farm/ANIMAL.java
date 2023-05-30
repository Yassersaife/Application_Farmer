/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

/**
 *
 * @author ADMIN
 */
public class ANIMAL {
    private int idanimal;
    private String name;
    private int count;
    private String animalproduct;
    private int idproduct;
    
    
    ANIMAL(){
        
    }
       public void setidproduct( int x){
            this.idproduct=x;
        }
         public int getidproduct( ){
           return this.idproduct;
         }
    
      public void setanimalproduct( String x){
            this.animalproduct=x;
        }
         public String getanimalproduct( ){
           return this.animalproduct;
         }
         
    public void setcount( int x){
            this.count=x;
        }
         public int getcount( ){
           return this.count;
         }
    
     public void setname( String x){
            this.name=x;
        }
         public String getname( ){
           return this.name;
         }
         
          public void setidanimal( int x){
            this.idanimal=x;
        }
         public int getidanimal( ){
           return this.idanimal;
        }
}

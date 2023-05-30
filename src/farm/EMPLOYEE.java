/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class EMPLOYEE {
    ANIMAL A1;
    private String Fname;
     private String Mname;
      private String Lname;
      private String SSN;
       private String Sex;
        private double Salary;
       private int idland;
        private int idanimal;
        private Date BD;
        EMPLOYEE( ){
            
        }
          public void setSex( String x){
            this.Sex=x;
        }
         public String getSex( ){
           return this.Sex;
        }
         public void setSalary( double x){
            this.Salary=x;
        }
         public double getSalary( ){
           return this.Salary;
        }
         public void setidanimal( int x){
            this.idanimal=x;
        }
         public int getidanimal( ){
           return this.idanimal;
        }
       
         public void setidland( int x){
            this.idland=x;
        }
         public int getidland( ){
           return this.idland;
        } 
         
        public void setSSN( String x){
            this.SSN=x;
        }
         public String getSSN( ){
           return this.SSN;
        }
            public void setFname( String x){
            this.Fname=x;
        }
         public String getFname( ){
           return this.Fname;
        }
              public void setLname( String x){
            this.Lname=x;
        }
         public String getLname( ){
           return this.Lname;
        }
              public void setMname( String x){
            this.Mname=x;
        }
         public String getMname( ){
           return this.Mname;
        }

    void setBirthDate(Date x) {
        this.BD=x;
    }
    Date getBD( ){
        return this.BD;
    }
         
}

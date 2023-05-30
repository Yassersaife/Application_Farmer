/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class LAND {
    private int idland;
            private String crop;
            private double area;
            private Date seeding;
            private Date harvisting;
            private int idcrop;
            
                public void setharvisting(Date x){
                this.harvisting=x;
            }
            public Date getharvisting(){
                return this.harvisting;
            }
            public void setseeding(Date x){
                this.seeding=x;
            }
            public Date getseeding(){
                return this.seeding;
            }
            public void setcrop(String x){
                this.crop=x;
            }
            public String getcrop(){
                return this.crop;
            }
            public int getidcrop(){
                return this.idcrop;
            }
            public void setidcrop(int x){
                this.idcrop=x;
            }
            public int getidland(){
                return this.idland;
            }
            public void setidland(int x){
                this.idland=x;
            }
}

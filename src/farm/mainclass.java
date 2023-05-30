/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farm;

import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class mainclass {
    public static void main(String args[]){
        
        login c=new login();
         c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 c.setSize(800,600);
		 c.setVisible( true ) ; //  display frame
    }
}

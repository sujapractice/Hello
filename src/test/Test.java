/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author HP
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        search:
                  for(int i=1; i<11; i++){
                      if(i==5){
                         break search; 
                      }
               System.out.println("Count is: " + i);
          }

    }
    
}

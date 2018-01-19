/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursions;

/**
 *
 * @author Rzhan
 */
public class Recursions {

     public  static  int sum( int n ) {
       if( n == 0 )
          return 0;
       return n + sum( n-1 );
      } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
      
      System.out.println(sum( 100 ));

        
    }
}
    


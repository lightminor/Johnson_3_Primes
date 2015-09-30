/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson_3_primes;

/**
 *
 * @author LightMajor
 */
public class Johnson_3_Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        //  for(int i = 0;i < 100;i++){
        //      if(i % 2  == 0 ){
        //           if(i % 3 !=0);{
        //                if(i % 5 != 0){
        //          }
        //           }
        //                System.out.println(i+" if even");       
        //               }
        int evens = 0;
        for(int i = 0; i < 100;i++){
                if(i % 2 == 0){
                    evens++;
                }
              
          }  
              System.out.println(evens);
// TODO code application logic here
    }
  

 /* 
    What is a Method?
           A method is a function 
           its like a little program , e.g.
           like finding a square root, something you might 
           want to do again and again.

*/
    
    static boolean iseven(int randomnumber ){
        return (randomnumber % 2 ==0);
    }
    static boolean isodd (int randomnumber) {    
        return (randomnumber % 2 !=0); 
    }    
    static boolean isPrime (int randomnumber){
        
    }            

        //a return value is the type of value 
        //your giving back to the program
    }


}
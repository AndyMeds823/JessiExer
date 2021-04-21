/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jessexercises;

/**
 *
 * @author amedi
 */
public class Ex3 {
    public static void main(String[] args){
    int [] arr = {25, 9, 5, -3};
    int sum = 0;
    for (int lu : arr ){
     if(lu >= 0){
         sum = sum + lu;
     } 
    }
    System.out.println("Sum is :" + sum);
  }
}

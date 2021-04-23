/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra;

/**
 *
 * @author amedi
 */
public class Ex5 {
    public static void main(String [] args){
    int x1 = 50, x2 = 75;
    boolean b = x1 >= x2;
    
    System.out.println(b);
    if(b = true) System.out.println("Success");
    else System.out.println("Failure");
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(b);
    }
    /*The result is success beacuse in the if statement b is being set
    as true.*/
}

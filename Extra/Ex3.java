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
public class Ex3 {
   public static void main(String[] args) {
    int x = 0;
    String message;
    while(x++ < 10) {}
      message = x > 10 ? "Greater than" : false;
    System.out.println(message +","+x);
    
  }
   /* If you run the program as is, it's a compliation error 
   beacuse a boolean can't be converted to string. I'm not very familiar
   with this.
   */
}

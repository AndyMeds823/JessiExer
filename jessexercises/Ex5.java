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
public class Ex5 {
   enum Months{
        Jan("The month is January"),Feb("The month is Febuary"),
        Mar("The month is March"),Apr("The month is April"),
        May("The month is May"),Jun("The month is Juna"),
        Jul("The month is July"),
        Aug("The month is August"),Sept("The month is September"),
        Oct("The month is October"),Nov("The month is November"),
        Dec("The month is December");
   private String des;
   private Months(String m){
       des=m;
   }
   public String getMon(){
       return des;
    }
   }
   
      public static void main(String[] args){
           for (Months mons: Months.values()){
            System.out.println(mons.getMon());
           }
         }
    }


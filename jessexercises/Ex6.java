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
public class Ex6 {
    enum Day{
        Mon,Tue,Wed,Thu,Fri,Sat,Sun;
       }
    static class D{
        Day Week;
        
        public D(Day Week){
        this.Week= Week;
        }

    public void WhatDay(){
        switch(Week){
            case Mon:
                System.out.println("It's Monday");
                break;
            case Tue:
                System.out.println("It's Tuesday");
                break;
            case Wed:
                System.out.println("It's Wednesday");
                break;
            case Thu:
                System.out.println("It's Thursday");
                break;
            case Fri:
                System.out.println("It's Friday");
                break;
            case Sat:
                System.out.println("It's Saturday");
                break;    
            case Sun:
                System.out.println("It's Sunday");
                break;
             default:
             System.out.println("Don't know");
             break;
        }
      }
   }
    public static void main(String [] args){
    D T1 = new D (Day.Fri);
    T1.WhatDay();
    }   
}
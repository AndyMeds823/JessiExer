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
public class Ex2 {
    public static void main(String [] args){
       StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb); 
        
    } 
    /*The result would be abbaccca because 
    [0]=a
    [1]=b
    [2]=b
    [3]=a
    [4]=c
    [5]=a
    [6]=c
    [7]=a
    each letter is entered and ocupies the position acordingly. 
    */
}

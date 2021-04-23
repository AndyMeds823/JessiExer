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
public class Ex6 {
    enum Flavors {
    VANILLA, CHOCOLATE, STRAWBERRY }
    public static void main(String[] args) {
    Flavors f = Flavors.STRAWBERRY;
    switch (f) {
        case VANILLA: System.out.println("vanilla");
        break;
        case CHOCOLATE: System.out.println("chocolate");
        break;
        case STRAWBERRY: System.out.println("strawberry");
        break;
        default: System.out.println("missing flavor");
        }
    /*
    switch (f) {
        case 0: System.out.println("vanilla");
        break;
        case 1: System.out.println("chocolate");
        break;
        case 2 : System.out.println("strawberry");
        break;
        default: System.out.println("missing flavor");
        }
    */
    }
/* First of all the result is a compliation error because the cases don't
    match the enums. Once cases are changed is should be different
    in this case the result would be Strawberry.*/
}

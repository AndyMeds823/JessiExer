package jessexercises;

/**
 *
 * @author amedi
 */
public class Ex1 {
    public static void main(String[] args) {
           int [] nums =  {2,-9,0,5,12,-25,22,9,8,12};
           double add = 0;
           double ave = 0;
           int c = 0;
           for( double a : nums){
           add = add + a;
           c++;
           }
                ave = add/c;
                System.out.println("Amount of numbers: "+c);
                System.out.println("Sum of array :" +add);
                System.out.println("Average of array :"+ ave);
    }
    
}

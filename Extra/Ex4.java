package Extra;

/**
 *
 * @author amedi
 */
public class Ex4 {
   public static void main(String [] args){
       for(int i=0; i<10 ; ) {
        i = i++;
        System.out.println("Hello World");
        System.out.println(i);
    }
  } 
   /*
   It seems infinite because it keeps printing hello world 
   and that is because de condition i++ is located inside the
   for not as a statement in the for.
   */
}

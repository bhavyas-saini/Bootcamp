
public class Day7 {
   public static void main(String[] args) {
       int a = 10;
       int checkbit = 3;
       int mask = 1 << (checkbit - 1);
       if (mask & a) {
           System.out.println("It's a set bit");

       }else{
           System.out.println("It's not a setbit");

       }
   }
}

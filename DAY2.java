import java.util.Scanner;
public class DAY2 {

    //Program to check if a number is positive, negative, or zero
    public static void check(int n){
        if(n>0){
            System.out.println(n+" Number is Positive");
        }else if  (n<0){
            System.out.println(n+" Number is Negative");
        }else{
            System.out.println(n+" Number is Zero");
        }
    }

    //Program to find the largest of three numbers
    public static void largest(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a+" is largest");
        }else if  (b>a && b>c){
            System.out.println(b+" is largest");
        }else{
            System.out.println(c+" is largest");
        }
    }

    //Program to check if a year is leap year
    public static void leap(int n){
        if(n%4==0){
            System.out.println(n+" is leap year");
        }else {
            System.out.println(n+" is not a leap year");
        }
    }


    //Program to check if a character  is vowel and consonant
    public static void vowel(char c){
       if (c == 'a' || c == 'e' || c =='i'|| c=='o' || c =='u'){
           System.out.println("Character is Vowel");
       }else {
           System.out.println("Character is Consonant");
       }
    }

    //Program to find a triangle is valid based on angles or sides
    public static void triangle(int a, int b, int c){
        if(a+b>c || a+c>b || b+c>a){
            System.out.println("It is a Triangle");
        }
        else {
            System.out.println("It's not a Triangle");
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        check(n);
        int a = 5,b = 4,c = 10;
        largest(a,b,c);
        leap(n);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        vowel(ch);
        triangle(a,b,c);


    }
}

import java.util.Scanner;

public class Day3 {

    // Factorial of a number
    public static int fact(int n){
        if(n==0 || n==1)
            return 1;

        return n*fact(n-1);
    }
//Fibonacci of a number
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        int ld = fibonacci(n-1);
        int sld = fibonacci(n-2);
         return ld+sld;
    }

//Sum of N number
    public static int SumofN(int n){
        if(n==0)
            return n;

        return n+SumofN(n-1);

    }
// Print N to 1
    public static void  Nto1(int n){
        if(n==0) return;
        else{
            System.out.println(n);
            Nto1(n-1);
        }

    }
    // Program to Count Digit
    public static int countDigit(int n){
        int cnt = 0;
        while(n!=0){
            n=n/10;
            cnt++;
        }
        return cnt;
    }

    //Check the number is Armstrong or not

    public static boolean Armstrong(int n){
        int k = countDigit(n);
        double sum =0;
        int num = n;
        while(num>0){
            int ld = num%10;
            sum += Math.pow(ld,k);
            num = num/10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+fact(n));
        System.out.println("Fibonacci of "+n+" is: "+fibonacci(n));
        System.out.println("Sum of "+n+" is: "+SumofN(n));
        Nto1(n);
        System.out.print("Enter a Number which digit you want to count: ");
        int m = sc.nextInt();
        System.out.println("Digit: "+countDigit(m));
        if(Armstrong(m)){
            System.out.println("It's an Armstrong number");
        }else {
            System.out.println("It's not an Armstrong number");
        }




    }
}

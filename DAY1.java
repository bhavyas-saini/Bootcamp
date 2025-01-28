public class DAY1 {
    public static void pattern1(int n){
        for(int  i = 1;i<=n;i++){
            for(int  j= 1;j<=n;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int  i = 1;i<=n;i++){
            for(int  j= 1;j<=n;j++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int  i = 1;i<=n;i++){
            for(int  j= 1;j<=i;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int  i = 1;i<=n;i++){
            for(int  j= 1;j<=i;j++){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        int c = 1;
        for(int  i = 1;i<=n;i++){
            for(int  j= 1;j<=i;j++){
                System.out.printf("%d ",c++);
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int  i = 0;i<=n;i++){
            for(int  j = 'A';j<'A'+i;j++){
                System.out.printf("%c ",j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int  i = 1;i<=n;i++){
            for(int  j= i;j<=n;j++){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for(int  i = 1;i<=n;i++){
            //space
            for(int j = 1;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int  j = i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n){


        for(int  i = 0;i<n;i++){

            //Space
          for(int j = 0;j<n-i-1;j++){
              System.out.print(" ");
          }
          // Star
            for(int  j= 0;j<2*i+1;j++){
                System.out.print("*");
            }
            // Space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n){

        //Upper

        for(int  i = 0;i<n;i++){

            //Space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // Star
            for(int  j= 0;j<2*i+1;j++){
                System.out.print("*");
            }
            // Space
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //Lower

        for(int  i = 1;i<=n;i++){

            //Space
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            // Star
            for(int  j= 0; j<2*n-(2*i+1);j++  ){
                System.out.print("*");
            }
            // Space
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
       int n = 4;
       int p = 5;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern6(n);
        System.out.println();
        pattern7(n);
        System.out.println();
        pattern8(n);
        System.out.println();
        pattern9(p);
        System.out.println();
        pattern10(p);


    }

}

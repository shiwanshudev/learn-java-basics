public class Main{
    public static void countDown(int n){
        if(n > 0){
            System.out.println(n);
            countDown(n-1);
        }
    }

    public static int factorial(int n){
        if(n <= 1 ){
            return 1;
        }
        return (n * factorial(n-1));
    }
    public static void main(String[] args){
        // countDown(5);
         System.out.println(factorial(8));
    }
}
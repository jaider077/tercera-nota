public class Fibonacci {

    public static void main(String[] args) {

        long a = 0;   
        long b = 1;   

        System.out.print(a + ", " + b); 

        for (int i = 3; i <= 50; i++) {
            long c = a + b;  
            System.out.print(", " + c);

            a = b;   
            b = c;
        }
    }
}
import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        int [] numeros = new int [5];  
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus numeros");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Los numeros son:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}
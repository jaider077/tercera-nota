import java.util.ArrayList;
import java.util.Scanner;

public class nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();

        System.out.print("¿Cuántos elementos quiere ingresar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del elemento " + (i + 1) + ": ");
            String elemento = sc.nextLine();
            elementos.add(elemento); 
        }

        System.out.println("\nLos elementos que ingresó son:");
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println((i + 1) + ". " + elementos.get(i));
        }

        sc.close();
    }
}

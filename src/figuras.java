import java.util.Scanner;

  public class figuras { 
    public static void main(String[] args) {
        double base, altura, area;
        String figura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la figura de la cual quiere calcular el area (triangulo, rectangulo, cuadrado): ");
        figura = scanner.nextLine();
        switch (figura) {
            case "cuadrado":
              System.out.println("ingrese el valor de la base");
              base = scanner.nextDouble();
              area = base*base;
              System.out.println("El area del cuadrado es: " +area);
                break;
            case "rectangulo":
              System.out.println("Ingrese el valor de la base");
              base = scanner.nextDouble();
              System.out.println("Ingrese el valor de la altura");
              altura = scanner.nextDouble();
              area = base*altura;
              System.out.println("El area del rectangulo es: " +area); 
                break;  
            case "triangulo":
              System.out.println("Ingrese el valor de la base");
              base = scanner.nextDouble();
              System.out.println("Ingrese el valor de la altura");
              altura = scanner.nextDouble();
              area = (base*altura)/2;
              System.out.println("El area del triangulo es: " +area); 
                break;  
            default:
            System.out.println("El area de esta figura no la podemos hallar");
                break;
        }

   }
}
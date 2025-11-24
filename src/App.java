import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Crear un Heroe y Villano
        Hero heroe = new Hero("Capitán America", 30, 20, 100);
        Villano villano = new Villano("Red Skull", 35, 15, 120);

        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║   BIENVENIDO A MARVEL RIVALS       ║");
        System.out.println("╚════════════════════════════════════╝\n");

        heroe.mostrarEstadisticas();
        villano.mostrarEstadisticas();

        int opcion;
        boolean juegoActivo = true;

        do {
            if (heroe.resistencia <= 0) {
                System.out.println("\n✗ ¡El Villano ha ganado! " + villano.nombre + " es el vencedor.");
                juegoActivo = false;
                break;
            }
            if (villano.resistencia <= 0) {
                System.out.println("\n✓ ¡El Héroe ha ganado! " + heroe.nombre + " ha salvado el día.");
                juegoActivo = false;
                break;
            }

            System.out.println("\n--- TURNO ---");
            System.out.println("Elige una acción:");
            System.out.println("1. El Hero ataca al villano");
            System.out.println("2. El Hero usa ataque especial");
            System.out.println("3. El Villano ataca al Hero");
            System.out.println("4. El Villano hace trampa");
            System.out.println("5. El Hero se recupera");
            System.out.println("6. El Villano se recupera");
            System.out.println("7. Mostrar estadísticas");
            System.out.println("8. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    heroe.atacar(villano);
                    break;

                case 2:
                    heroe.ataqueEspecial(villano);
                    break;

                case 3:
                    villano.atacar(heroe);
                    break;

                case 4:
                    villano.hacerTrampa(heroe);
                    break;

                case 5:
                    heroe.recuperarse();
                    break;

                case 6:
                    villano.recuperarse();
                    break;

                case 7:
                    heroe.mostrarEstadisticas();
                    villano.mostrarEstadisticas();
                    break;

                case 8:
                    System.out.println("\n¡Hasta luego!");
                    juegoActivo = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

        } while (juegoActivo);

        scanner.close();
    }
}

class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int resistencia;

    public Personaje(String nombre, int fuerza, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public void atacar(Personaje oponente) {
        System.out.println( nombre + " ataca a " + oponente.nombre + " con una fuerza de " + fuerza + " puntos.");
        oponente.resistencia -= fuerza;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;
        System.out.println(oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }

    public void mostrarEstadisticas() {
        System.out.println("\n─────────────────────────────────");
        System.out.println(" Estadísticas de " + nombre);
        System.out.println("─────────────────────────────────");
        System.out.println(" Fuerza: " + fuerza);
        System.out.println(" Velocidad: " + velocidad);
        System.out.println("  Resistencia: " + resistencia);
        System.out.println("─────────────────────────────────\n");
    }

    public void recuperarse() {
        resistencia += 20;
        System.out.println( nombre + " se ha recuperado y ahora tiene " + resistencia + " puntos de resistencia.");
    }
}

class Hero extends Personaje {
    public Hero(String nombre, int fuerza, int velocidad, int resistencia) {
        super(nombre, fuerza, velocidad, resistencia);
    }

    public void ataqueEspecial(Personaje oponente) {
        int poderExtra = velocidad * 2;
        System.out.println(nombre + " realiza un ATAQUE ESPECIAL a " + oponente.nombre + " con " + poderExtra + " puntos de daño.");
        oponente.resistencia -= poderExtra;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;
        System.out.println( oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }
}

class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int velocidad, int resistencia) {
        super(nombre, fuerza, velocidad, resistencia);
    }

    public void hacerTrampa(Personaje oponente) {
        int dobleAtaque = fuerza * 2;
        System.out.println( nombre + " hace trampa y ataca con el doble de fuerza: " + dobleAtaque + " puntos de daño.");
        oponente.resistencia -= dobleAtaque;
        if (oponente.resistencia < 0)
            oponente.resistencia = 0;
        System.out.println( oponente.nombre + " ahora tiene " + oponente.resistencia + " puntos de resistencia.");
    }
}
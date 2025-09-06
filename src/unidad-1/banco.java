public class banco {
    public static void main(String[] args) {
        int saldo = 1000;
        int retiro = 200;
        int semanas = 4;
        int saldoFinal = saldo - (retiro * semanas);
        System.out.println("Saldo inicial: $" + saldo);
        System.out.println("Retiro semanal: $" + retiro);
        System.out.println("Semanas: " + semanas);
        System.out.println("Saldo final después del mes: $" + saldoFinal);
    }
}
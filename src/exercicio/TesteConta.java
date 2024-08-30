package exercicio;

public class TesteConta {

    public static void main(String[] args) {
        Conta c1 = new Conta(11, "Fausto Bernard",
                1000, "100");

        c1.sacar(100);
        System.out.println(c1.getSaldo());

        Conta c2 = new Conta(12, "Barbara Prince",
                100, "100");

        System.out.println("Saldo da conta 2: " + c2.getSaldo());

        c1.transferir(c2, 100);
        System.out.println("Saldo da conta 1: " + c1.getSaldo());
        System.out.println("Saldo da conta 2: " + c2.getSaldo());
    }
}

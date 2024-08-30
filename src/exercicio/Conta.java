package exercicio;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private String agencia;

    public Conta(int numero, String titular, double saldo, String agencia){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    public void sacar(double valor){
        if(this.saldo - valor > 0){
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(Conta contaDestino, double valor){
        if(this.saldo - valor > 0){
            contaDestino.saldo = contaDestino.saldo + valor;
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente para essa transferência");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

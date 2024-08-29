package pilares;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setEndereco("Rua A, Cond. Jardins das Flores, 330");
        pessoa.setNome("José Santos");
        pessoa.setIdade(34);
        pessoa.escreverNaTela();
    }
}


package pilares;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    protected float rendaAnual;

    public double calcularImposto() {
        return 0.0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public float getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(float rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public void escreverNaTela() {
        System.out.println("Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}');
    }

}










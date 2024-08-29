package pilares;

public class PessoaFisica extends Pessoa{
    private String cfp;
    public String getCfp() {
        return cfp;
    }
    public void setCfp(String cfp) {
        this.cfp = cfp;
    }
    @Override
    public double calcularImposto() {
        return rendaAnual * 0.15;
    }
}



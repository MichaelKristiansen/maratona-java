package academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.dominio;

public class CachorroDeRua extends Cachorro {
    protected boolean doenca;

    public CachorroDeRua(String raca, String tamanho, boolean doenca) {
        super(raca, tamanho);
        this.doenca = doenca;
    }

    @Override
    public void imprime() {
        super.imprime();
        if (this.doenca == true) {
            System.out.println("Cachorro doente");
        } else {
            System.out.println("Cachorro saúdavel");
        }
    }

    public boolean isDoenca() {
        return doenca;
    }

    public void setDoenca(boolean doenca) {
        this.doenca = doenca;
    }
}

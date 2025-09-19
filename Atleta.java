//Classe Atleta

public class Atleta extends Pessoa {
    private String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }
    public String getEsportePraticado() { return esportePraticado; }
    public void setEsportePraticado(String esportePraticado) { this.esportePraticado = esportePraticado; }

    @Override
    public double calcularIMC() {
        return super.calcularIMC() * 0.95;
    }
    @Override
    public String toString() {
    return "Atleta: " + getNome() + " - IMC: " + String.format("%.2f", calcularIMC())+ "\n";
    }

}
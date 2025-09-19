//Classe base Pessoa

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
    @Override
    public String toString() {
    return "Pessoa: " + nome + " - IMC: " + String.format("%.2f", calcularIMC()) + "\n";
    }

}
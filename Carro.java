// Integrantes da equipe:
// Deilson Pereira Alves
// Juciana Maria Diniz
// Mathias Ferreira do Nascimento e Silva
// Rahissa Beatriz Alencar Almeida

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
        super(placa, marca, modelo, ano, valor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularIpva() {
        return getValor() * 0.035; // 3,5%
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("--------------------------");
    }
}

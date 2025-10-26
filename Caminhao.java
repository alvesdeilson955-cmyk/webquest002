// Integrantes da equipe:
// Deilson Pereira Alves
// Juciana Maria Diniz
// Mathias Ferreira do Nascimento e Silva
// Rahissa Beatriz Alencar Almeida

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5) {
            return getValor() * 0.02; // até 5 toneladas
        } else {
            return getValor() * 0.03; // acima de 5 toneladas
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("--------------------------");
    }
}

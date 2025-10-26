// Integrantes da equipe:
// Deilson Pereira Alves
// Juciana Maria Diniz
// Mathias Ferreira do Nascimento e Silva
// Rahissa Beatriz Alencar Almeida

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIpva() {
        return getValor() * 0.025; // 2,5%
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("--------------------------");
    }
}

// Integrantes da equipe:
// Deilson Pereira Alves
// Juciana Maria Diniz
// Mathias Ferreira do Nascimento e Silva
// Rahissa Beatriz Alencar Almeida

import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // Adicionando carros
        veiculos.add(new Carro("ABC-1234", "Toyota", "Corolla", 2022, 120000, 4));
        veiculos.add(new Carro("DEF-5678", "Fiat", "Argo", 2021, 65000, 4));
        veiculos.add(new Carro("GHI-9012", "Honda", "Civic", 2023, 110000, 4));

        // Adicionando motos
        veiculos.add(new Moto("JKL-3456", "Yamaha", "MT-03", 2023, 32000, 321));
        veiculos.add(new Moto("MNO-7890", "Honda", "CB500", 2022, 40000, 500));

        // Adicionando caminhões
        veiculos.add(new Caminhao("PQR-1122", "Volvo", "FH16", 2021, 500000, 8));
        veiculos.add(new Caminhao("STU-3344", "Mercedes", "Accelo", 2022, 350000, 4));

        System.out.println("=== VEÍCULOS CADASTRADOS NA CONCESSIONÁRIA ===\n");
        for (Veiculo v : veiculos) {
            v.mostrarInfo();
        }
    }
}


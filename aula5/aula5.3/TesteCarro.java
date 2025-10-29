public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setNumPassageiros(5);
        carro.setCapCombustivel(50.0);
        carro.setConsumoCombustivel(12.5);
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Número de Passageiros: " + carro.getNumPassageiros());
        System.out.println("Capacidade do Combustível: " + carro.getCapCombustivel());
        System.out.println("Consumo de Combustível: " + carro.getConsumoCombustivel());
    }
}
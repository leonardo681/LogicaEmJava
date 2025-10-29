public class Barco extends Embarcacao {
    private double tamanho; 
    
    
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Tamanho: " + tamanho + " metros");
    }
}

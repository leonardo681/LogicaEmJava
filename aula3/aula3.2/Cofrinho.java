public class Cofrinho {
    private Pessoa dono;
    private int qt50; 
    private int qt25; 
    private int qt10; 

    public Cofrinho(Pessoa dono) {
        this.dono = dono;
        this.qt50 = 0;
        this.qt25 = 0;
        this.qt10 = 0;
    }

    public Pessoa getDono() {
        return dono;
    }
    
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public void depositaUmaMoedaDezCentavos() {
        qt10 += 1;
    }

    public void depositaUmaMoedaVinteCincoCentavos() {
        qt25 += 1;
    }

    public void depositaUmaMoedaCinquentaCentavos() {
        qt50 += 1;
    }

    public double calculaTotal() {
        double total = 0.10 * qt10 + 0.25 * qt25 + 0.50 * qt50;
        return total;
    }
}

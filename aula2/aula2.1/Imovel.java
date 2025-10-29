public class Imovel
{
    private String tipo;
    private double area;
    private int quartos;
    
    public Imovel (String tipo, double area, int quartos){
        this.tipo = tipo;
        this.area = area;
        this.quartos = quartos;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public double getArea(){
        return area;
    }
    
    public int getQuartos(){
        return quartos;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
    
    public void exibeDados() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Area: " + area + "m²");
        System.out.println("Quartos: " + quartos);
    }
}
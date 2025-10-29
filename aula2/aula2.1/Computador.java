public class Computador
{
    private String marca;
    private String modelo;
    private int memoriaRAMGB;
    
    public Computador (String marca, String modelo, int memoriaRAMGB){
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAMGB = memoriaRAMGB;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getMemoriaRAMGB(){
        return memoriaRAMGB;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    public void setMemoriaRAMGB(int memoriaRAMGB) {
        this.memoriaRAMGB = memoriaRAMGB;
    }
    
    public void exibeDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria RAM: " + memoriaRAMGB);

    }
    
    
}
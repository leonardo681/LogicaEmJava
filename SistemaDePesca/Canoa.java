public class Canoa extends Embarcacao {
    private String material; 
    
    

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Material: " + material);
    }
}

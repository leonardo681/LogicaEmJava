public class Lancha extends Embarcacao {
    private int potenciaMotor; 
    
   
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Potência do Motor: " + potenciaMotor + " HP");
    }
}

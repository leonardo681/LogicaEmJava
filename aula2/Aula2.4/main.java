public class main
{
    public static void main(String[] args) {
        Pessoa mario = new Pessoa("Mario","vermelho",3);
        Pessoa luigi = new Pessoa("Luigi","verde",3);
        
        mario.mostrarEstado();
        luigi.mostrarEstado();
        
        mario.pular();
        luigi.pular();
        
        mario.setCorRoupa("roxo");
        luigi.setVida(5);
        
        mario.perderVida();
        luigi.perderVida();
        
        mario.mostrarEstado();
        luigi.mostrarEstado();
        
        
        
    }
}
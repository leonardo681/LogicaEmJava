public class Aluno extends Usuario
{
    private double notaGA;
    private double notaGB;
    
    public Aluno(int matrigula, String nome, String login, String senha){
        super(matrigula,nome,login,senha);
    }
    
    public double getNotaGA(){
        return notaGA;
    }
    
    public void setNotaGA(double notaGA){
        this.notaGA = notaGA;
    }
    
    public double getNotaGB(){
        return notaGB;
    }
    
    public void setNotaGB(double notaGB){
        this.notaGB = notaGB;
    }
    
}

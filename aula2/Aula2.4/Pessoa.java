public class Pessoa
{
    private String nome;
    private String corRoupa;
    private int vida;
    
    public Pessoa(String nome, String corRoupa, int vida){
        this.nome = nome;
        this.corRoupa = corRoupa;
        this.vida = vida;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCorRoupa(){
        return corRoupa;
    }
    public int getVida(){
        return vida;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCorRoupa(String corRoupa){
        this.corRoupa = corRoupa;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public void pular(){
        System.out.println(nome + " pulou");
    }
    
    public void perderVida(){
        if(vida>0){
            vida--;
            System.out.println(nome + " perdeu uma vida. vidas restantes: " + vida);
        } else {
            System.out.println(nome + " esta sem vidas");
        }
    }
    
    public void mostrarEstado() {
        System.out.println(nome + " está com uma roupa " + corRoupa + " e tem " + vida + " vida");
    }
    
}
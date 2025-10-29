public class Pessoa
{
    private String nome;
    private Data dataNacimento;
    
    public Pessoa(String nome, Data dataNacimento) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Data getDataNacimento() {
        return dataNacimento;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataNacimento(Data dataNacimento){
        this.dataNacimento = dataNacimento;
    }
    
    public void exibeDados() {
        System.out.println("Nome: "+nome);
        System.out.println("Data de nacimento");
        dataNacimento.exiberData();
    }
}
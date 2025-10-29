public class Teste
{
    public static void main(String[] args){
        Data dataNacimento = new Data(9,9,2004);
        
        Pessoa pessoa1 = new Pessoa("Leonardo", dataNacimento);
        
        pessoa1.exibeDados();
    }
}
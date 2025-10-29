public class Pessoa
{
        private String nome;
        private int idade;
        
        public Pessoa(String n, int i){
            nome = n;
            if (i>0)
                idade = i;
        }
        
        public void fazAniversario(){
            idade += 1;
        }
        
        public String getNome(){
            return nome;
        }
        
        public int getIdade(){
            return idade;
        }
        
        public void setNome(String n){
            nome = n;
        }
        
        public void setIdade(int i){
            if (i>0)
                idade = i;
        }

        
        public void exibirDados(){
            System.out.println("Nome: "+nome);
            System.out.println("Idade: "+idade);
        }

        
        
        
}
import java.util.Scanner;
public class Pescador {
    private String nome;
    private int cpf;
    private int dataNascimento;
    
    
    Scanner scanner = new Scanner(System.in);
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void exibeDados() {
        System.out.println("Nome do Pescador: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
    
    
    
    
        
    
}

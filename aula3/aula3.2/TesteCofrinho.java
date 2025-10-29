import java.util.Scanner;
public class TesteCofrinho
{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); 
    
    Cofrinho c1, c2, c3;
    
    Pessoa p;
    
    System.out.print("Qual o nome do dono do primeiro cofrinho? ");
    String nome = scanner.nextLine();
    System.out.print("Qual o Idade do dono? ");
    int idade = scanner.nextInt();
    
    p = new Pessoa(nome,idade);
    
    
    
    scanner.close();
    }
}
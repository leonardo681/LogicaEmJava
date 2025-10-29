import java.util.Scanner;
public class ListaDeAlunos {
    private Aluno[] alunos; 
    private int totalAlunos;
    Scanner scanner = new Scanner(System.in);
    public ListaDeAlunos(int capacidade) {
        alunos = new Aluno[capacidade];
        totalAlunos = 0;
    }

    public boolean adicionarAluno(Aluno a) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getCodigo() == a.getCodigo()) {
                System.out.println("Aluno com código " + a.getCodigo() + " já está na lista.");
                return false; 
            }
        }

        if (totalAlunos < alunos.length) {
            alunos[totalAlunos] = a;
            totalAlunos++;
            return true;
        } else {
            System.out.println("Lista cheia. Não é possível adicionar o aluno.");
            return false;
        }
    }
    
    public Aluno buscarAluno() {
        System.out.print("\nDigite o código do aluno: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getCodigo() == codigo) {
                return alunos[i];
            }
        }
        
        return null;
        
    }

    public void exibirLista() {
        if (totalAlunos == 0) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("\n=== Lista de Alunos ===");
            for (int i = 0; i < totalAlunos; i++) {
                alunos[i].exibeDados();
                System.out.println("----------------------");
            }
        }
    }
}

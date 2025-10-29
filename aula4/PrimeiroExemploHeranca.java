public class PrimeiroExemploHeranca {
    public static void main(String args[]) {
        /*
        Usuario usuario = new Usuario(
            Teclado.leInt("Informe a matrícula do usuário: "),
            Teclado.leString("Informe o nome do usuário: "),
            Teclado.leString("Informe o login do usuário: "),
            Teclado.leString("Informe a senha do usuário: ")
        );
        */
        Professor professor = new Professor(
            Teclado.leInt("Informe a matrícula do professor: "),
            Teclado.leString("Informe o nome do professor: "),
            Teclado.leString("Informe o login do professor: "),
            Teclado.leString("Informe a senha do professor: ")
        );

        Aluno aluno = new Aluno(
            Teclado.leInt("Informe a matrícula do aluno: "),
            Teclado.leString("Informe o nome do aluno: "),
            Teclado.leString("Informe o login do aluno: "),
            Teclado.leString("Informe a senha do aluno: ")
        );

        System.out.println("\n--- Dados do Usuário ---");

        System.out.println("\n--- Dados do Professor ---");
        System.out.println("Matrícula do professor: " + professor.getMatricula());
        System.out.println("Nome do professor: " + professor.getNome());

        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        System.out.println("Nome do aluno: " + aluno.getNome());
    }
}


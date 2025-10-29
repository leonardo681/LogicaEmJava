import java.util.Scanner;
public class SistemaEscolaEAD {
        public static void main(String[] args) {
            
            ListaDeAlunos listaDeAlunos = new ListaDeAlunos(100); 
            Scanner scanner = new Scanner(System.in);
            System.out.println("=== CADASTRO DE CURSOS ===");
            System.out.print("Quantos cursos deseja cadastrar? ");
            int numCursos = scanner.nextInt();
            scanner.nextLine(); 
            
            Curso[][] matrizCursos = new Curso[2][numCursos];
            for (int i = 0; i < numCursos; i++) {
                System.out.println("\nCurso " + (i + 1) + ":");
                System.out.print("Código: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Duração (horas): ");
                int duracao = scanner.nextInt();
                scanner.nextLine();
    
                
                int semestre = (i % 2 == 0) ? 0 : 1;
                matrizCursos[semestre][i/2] = new Curso(codigo, nome, duracao);
            }
            
            int opcao;
                do {
                    System.out.println("\n=== MENU ===");
                    System.out.println("1 - Visualizar Lista de Alunos");
                    System.out.println("2 - Adicionar Aluno");
                    System.out.println("3 - Verificar Notas do Aluno");
                    System.out.println("4 - Verificar Financeiro do Aluno");
                    System.out.println("5 - Sair");
                    System.out.print("Escolha uma opção: ");
                    
                    
                    opcao = scanner.nextInt();
                    scanner.nextLine(); 
        
                    switch (opcao) {
                        case 1:
                            listaDeAlunos.exibirLista();
                            break;
        
                        case 2:
                            System.out.println("\n=== NOVO ALUNO ===");
                                System.out.print("Código: ");
                                int codigo = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Nome: ");
                                String nome = scanner.nextLine();
                                System.out.print("Data Nascimento (dd/mm/aaaa): ");
                                String dataNasc = scanner.nextLine();
                                System.out.print("Email: ");
                                String email = scanner.nextLine();
                                System.out.print("Senha: ");
                                String senha = scanner.nextLine();
                        
                                System.out.print("É bolsista? (S/N): ");
                                String bolsista = scanner.nextLine();
                        
                                Aluno novoAluno;
                                if (bolsista.equalsIgnoreCase("S")) {
                                    System.out.print("Tipo de bolsa: (Só tem de 50%)");
                                    String tipoBolsa = scanner.nextLine();
                                    novoAluno = new AlunoBolsista(codigo, nome, dataNasc, email, senha, tipoBolsa);
                                } else {
                                    novoAluno = new Aluno(codigo, nome, dataNasc, email, senha);
                                }
                        
                                if (listaDeAlunos.adicionarAluno(novoAluno)) {
                                    System.out.println("Aluno cadastrado com sucesso!");
                                    double[] parcelas = {500.0, 500.0, 500.0, 500.0, 500.0, 500.0};
                                    novoAluno.adicionarMensalidades(parcelas);
                                }
                            
                                
                            if (listaDeAlunos.adicionarAluno(novoAluno)) {
                                System.out.println("Aluno cadastrado com sucesso!");
                            }
                            break;
                        
                        case 3:
                                Aluno aluno = listaDeAlunos.buscarAluno();
                                if (aluno != null) {
                                    aluno.exibirNotas();
                                    
                                    System.out.print("\nDeseja lançar/alterar notas? (S/N): ");
                                    String resposta = scanner.nextLine();
                                    
                                    if (resposta.equalsIgnoreCase("S")) {
                                        do {
                                            System.out.println("\n=== LANÇAMENTO DE NOTAS ===");
                                            System.out.println("1 - Lançar Nota 1");
                                            System.out.println("2 - Lançar Nota 2");
                                            System.out.println("3 - Lançar Nota 3");
                                            System.out.println("4 - Lançar Todas as Notas");
                                            System.out.println("0 - Voltar");
                                            System.out.print("Escolha uma opção: ");
                                            
                                            opcao = scanner.nextInt();
                                            scanner.nextLine();
                                            
                                            switch (opcao) {
                                                case 1:
                                                    System.out.print("Digite a Nota 1: ");
                                                    double nota1 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    aluno.lancarNota(1, nota1);
                                                    break;
                                                    
                                                case 2:
                                                    System.out.print("Digite a Nota 2: ");
                                                    double nota2 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    aluno.lancarNota(2, nota2);
                                                    break;
                                                    
                                                case 3:
                                                    System.out.print("Digite a Nota 3: ");
                                                    double nota3 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    aluno.lancarNota(3, nota3);
                                                    break;
                                                    
                                                case 4:
                                                    System.out.print("Digite a Nota 1: ");
                                                    nota1 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    System.out.print("Digite a Nota 2: ");
                                                    nota2 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    System.out.print("Digite a Nota 3: ");
                                                    nota3 = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    aluno.lancarNotas(nota1, nota2, nota3);
                                                    System.out.println("Todas as notas lançadas com sucesso!");
                                                    break;
                                                    
                                                case 0:
                                                    System.out.println("Voltando ao menu anterior...");
                                                    break;
                                                    
                                                default:
                                                    System.out.println("Opção inválida!");
                                            }
                                            
                                            
                                            if (opcao >= 1 && opcao <= 4) {
                                                System.out.println("\n--- NOTAS ATUALIZADAS ---");
                                                aluno.exibirNotas();
                                            }
                                            
                                        } while (opcao != 0);
                                    }
                                } else {
                                    System.out.println("Aluno não encontrado!");
                                        
                                    }
                                break;
                        case 4:
                                Aluno alun = listaDeAlunos.buscarAluno();
                                if (alun != null) {
                                    alun.exibirMensalidades();
                        
                                    System.out.print("\nDeseja pagar alguma parcela? (S/N): ");
                                    String resposta = scanner.nextLine();
                                    if (resposta.equalsIgnoreCase("S")) {
                                        System.out.print("Número da parcela: ");
                                        int parcela = scanner.nextInt();
                                        scanner.nextLine();
                                        alun.pagarMensalidade(parcela);
                                    }
                                } else {
                                    System.out.println("Aluno não encontrado!");
                                }
                                
                                break;
                        case 5:
                                System.out.println("Saindo do sistema...");
                                break;
        
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                        }
            } while (opcao != 5);
    
            scanner.close();
                
                
            }
        }

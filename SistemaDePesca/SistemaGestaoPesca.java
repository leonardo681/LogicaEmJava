import java.util.Scanner;
public class SistemaGestaoPesca {
    private Pescador[] pescadores = new Pescador[10];
    private int totalPescadores = 0;
    private Captura[] capturas = new Captura[10];
    private int totalCapturas = 0;
    private int totalTiposPeixe = 0;
    private Embarcacao[] embarcacoes = new Embarcacao[10];
    private int totalEmbarcacoes = 0;
    int[][] matrizCapturas = new int[totalPescadores][totalTiposPeixe];
    

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SistemaGestaoPesca sistema = new SistemaGestaoPesca();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
                System.out.println("\n=== SISTEMA DE GESTÃO DE PESCA ===");
                System.out.println("1 - Cadastrar Pescador");
                System.out.println("2 - Cadastrar Embarcação");
                System.out.println("3 - Registrar Captura");
                System.out.println("4 - Buscar Pescador");
                System.out.println("5 - Exibir Capturas");
                System.out.println("6 - Exibir Relatorio");
                System.out.println("7 - TOTAL DE CAPTURAS POR TIPO DE PEIXE");
                System.out.println("8 - Gerar Relatório Detalhado de Capturas");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
    
                switch (opcao) {
                    case 1:
                        sistema.cadastrarPescador();
                        break;
                    case 2:
                        sistema.cadastrarEmbarcacao();
                        break;
                    case 3:
                        sistema.registrarCaptura();
                        break;
                    case 4:
                        sistema.buscarPescador();
                        break;
                    case 5:
                        sistema.exibirCapturas();
                        break;
                    case 6:
                        sistema.gerarMatrizCapturas();
                        break;
                    case 7:
                        sistema.contarCapturasPorTipoPeixe();
                        break;
                    case 8:
                        sistema.gerarRelatorioCapturaDetalhado();
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                    default:
                        System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
    
    public void buscarPescador() {

        System.out.println("\n=== BUSCAR PESCADOR ===");
        System.out.println("1 - Buscar por Nome");
        System.out.println("2 - Buscar por CPF");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome: ");
                String nomeBusca = scanner.nextLine();
                buscarPescador(nomeBusca); 
                break;
            case 2:
                System.out.print("Digite o CPF: ");
                int cpfBusca = scanner.nextInt();
                buscarPescador(cpfBusca);
                break;

            default:
                System.out.println("❌ Opção inválida!");
        }
    }
    
    public void buscarPescador(String nome) {
            boolean encontrado = false;
            for (int i = 0; i < totalPescadores; i++) {
                if (pescadores[i].getNome().equalsIgnoreCase(nome)) {
                    System.out.println("\n✅ Pescador encontrado:");
                    pescadores[i].exibeDados();
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("❌ Nenhum pescador encontrado com esse nome.");
            }
    }
    
    public void buscarPescador(int cpf) {
            boolean encontrado = false;
            for (int i = 0; i < totalPescadores; i++) {
                if (pescadores[i].getCpf() == cpf) {
                    System.out.println("\n✅ Pescador encontrado:");
                    pescadores[i].exibeDados();
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("❌ Nenhum pescador encontrado com esse CPF.");
            }
    }

    public void cadastrarPescador() {
        Pescador pescador = new Pescador();

        System.out.print("Nome do Pescador: ");
        pescador.setNome(scanner.nextLine());

        System.out.print("CPF: ");
        pescador.setCpf(scanner.nextInt());

        System.out.print("Data de Nascimento: ");
        pescador.setDataNascimento(scanner.nextInt());

        System.out.println("✅ Pescador cadastrado com sucesso!\n");
        pescadores[totalPescadores] = pescador;
        totalPescadores++;
    }
    
    
        
    public void registrarCaptura() {
        Captura captura = new Captura();

        System.out.print("Data da Captura: ");
        captura.setDataCaptura(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Quantidade: ");
        captura.setQuantidade(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Tipo de Peixe: ");
        captura.setTipoPeixe(scanner.nextLine());
        
        System.out.print("nome do Pescador: ");
        captura.setNomePescador(scanner.nextLine());
        
        System.out.print("nome da Embarcacao: ");
        captura.setNomeEmbarcacao(scanner.nextLine());

        System.out.println("✅ Captura registrada com sucesso!\n");
        capturas[totalCapturas] = captura;
        totalCapturas++;
    }
    
    public void cadastrarEmbarcacao() {
        System.out.println("\nEscolha o tipo de embarcação:");
        System.out.println("1 - Barco");
        System.out.println("2 - Lancha");
        System.out.println("3 - Canoa");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        Embarcacao embarcacao = null;

        switch (tipo) {
            case 1:
                embarcacao = new Barco();
                embarcacao.setTipo("Barco");
                System.out.print("Nome do Barco: ");
                embarcacao.setNome(scanner.nextLine());
                System.out.print("Ano de Fabricação: ");
                embarcacao.setAnoFabricacao(scanner.nextInt());
                System.out.print("Tamanho (em metros): ");
                ((Barco) embarcacao).setTamanho(scanner.nextDouble());
                scanner.nextLine();
                break;

            case 2:
                embarcacao = new Lancha();
                embarcacao.setTipo("Lancha");
                System.out.print("Nome da Lancha: ");
                embarcacao.setNome(scanner.nextLine());
                System.out.print("Ano de Fabricação: ");
                embarcacao.setAnoFabricacao(scanner.nextInt());
                System.out.print("Potência do Motor (HP): ");
                ((Lancha) embarcacao).setPotenciaMotor(scanner.nextInt());
                scanner.nextLine();
                break;

            case 3:
                embarcacao = new Canoa();
                embarcacao.setTipo("Canoa");
                System.out.print("Nome da Canoa: ");
                embarcacao.setNome(scanner.nextLine());
                System.out.print("Ano de Fabricação: ");
                embarcacao.setAnoFabricacao(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Material da Canoa: ");
                ((Canoa) embarcacao).setMaterial(scanner.nextLine());
                break;

            default:
                System.out.println("❌ Tipo inválido!");
                return;
        }
        embarcacoes[totalEmbarcacoes] = embarcacao;
        totalEmbarcacoes++;
        System.out.println("✅ Embarcação cadastrada com sucesso!\n");
    }
    
    public void exibirCapturas() {
        if (totalCapturas == 0) {
            System.out.println("❌ Nenhuma captura registrada!");
            return;
        }
        
        System.out.println("\n=== CAPTURAS REGISTRADAS ===");
        for (int i = 0; i < totalCapturas; i++) {
            System.out.println("Captura " + (i + 1) + ":");
            System.out.println("Data: " + capturas[i].getDataCaptura());
            System.out.println("Quantidade: " + capturas[i].getQuantidade());
            System.out.println("Tipo de Peixe: " + capturas[i].getTipoPeixe());
            System.out.println("-------------------------");
        }
    }
    
    public void gerarMatrizCapturas() {
        if (totalCapturas == 0) {
            System.out.println("❌ Nenhuma captura registrada!");
            return;
        }
    
        String[] tiposPeixe = {"Salmão", "Tilápia", "Pirarucu", "Dourado", "Pacu"};
        int totalTiposPeixe = tiposPeixe.length;
    
        int[][] matrizCapturas = new int[totalPescadores][totalTiposPeixe];
    
        for (int i = 0; i < totalCapturas; i++) {
            Captura c = capturas[i];
            int indexPescador = -1;
    
            for (int j = 0; j < totalPescadores; j++) {
                if (pescadores[j].getNome().equalsIgnoreCase(c.getNomePescador())) { 
                    indexPescador = j;
                    break;
                }
            }
    
            if (indexPescador != -1) {
                for (int k = 0; k < totalTiposPeixe; k++) {
                    if (c.getTipoPeixe().equalsIgnoreCase(tiposPeixe[k])) {
                        matrizCapturas[indexPescador][k] += c.getQuantidade();
                        break;
                    }
                }
            }
        }
    
        exibirRelatorioCapturas(matrizCapturas, tiposPeixe);
    }
    
    private void exibirRelatorioCapturas(int[][] matriz, String[] tiposPeixe) {
        System.out.println("\n=== RELATÓRIO DE CAPTURAS POR PESCADOR ===");
        
        for (int i = 0; i < totalPescadores; i++) {
            System.out.println("\nPescador: " + pescadores[i].getNome());
            for (int j = 0; j < tiposPeixe.length; j++) {
                System.out.println("  " + tiposPeixe[j] + ": " + matriz[i][j] + " unidades");
            }
        }
    }
    
        public void contarCapturasPorTipoPeixe() {
        if (totalCapturas == 0) {
            System.out.println("❌ Nenhuma captura registrada!");
            return;
        }
    
        String[] tiposPeixe = {"Salmão", "Tilápia", "Pirarucu", "Dourado", "Pacu"};
        int[] totalPorTipo = new int[tiposPeixe.length];
    
        for (int i = 0; i < totalCapturas; i++) {
            Captura c = capturas[i];
            for (int j = 0; j < tiposPeixe.length; j++) {
                if (c.getTipoPeixe().equalsIgnoreCase(tiposPeixe[j])) {
                    totalPorTipo[j] += c.getQuantidade();
                    break;
                }
            }
        }
    
        System.out.println("\n=== TOTAL DE CAPTURAS POR TIPO DE PEIXE ===");
        for (int i = 0; i < tiposPeixe.length; i++) {
            System.out.println(tiposPeixe[i] + ": " + totalPorTipo[i] + " unidades");
        }
    }
    
    public void gerarRelatorioCapturaDetalhado() {
        if (totalCapturas == 0) {
            System.out.println("❌ Nenhuma captura registrada!");
            return;
        }
    
        System.out.println("\n=== RELATÓRIO DETALHADO DE CAPTURAS ===");
    
        for (int i = 0; i < totalCapturas; i++) {
            Captura c = capturas[i];
            System.out.println("Captura " + (i + 1) + ":");
            System.out.println("Data: " + c.getDataCaptura());
            System.out.println("Pescador: " + c.getNomePescador());
            System.out.println("Embarcação: " + c.getNomeEmbarcacao());
            System.out.println("Quantidade: " + c.getQuantidade());
            System.out.println("Tipo de Peixe: " + c.getTipoPeixe());
            System.out.println("-------------------------------");
        }
    }


}


public class Aluno {
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;
    private double[] notas;
    private boolean[] lancada;
    private mensalidade[] mensalidades;
    private int numParcelas;

    // Construtor completo
    public Aluno(int codigo, String nome, String dataNascimento, String email, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.notas = new double[3];
        this.lancada = new boolean[3];
        this.mensalidades = new mensalidade[12];
        this.numParcelas = 0;
    }

    
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public double[] getNotas() { return notas; }
    public boolean[] getLancada() { return lancada; }

    public mensalidade[] getMensalidades() { return mensalidades; }
    public int getNumParcelas() { return numParcelas; }

    
    public void exibeDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
    }

        public void lancarNota(int numeroNota, double valor) {
        if (numeroNota >= 1 && numeroNota <= 3) {
            notas[numeroNota - 1] = valor;
            lancada[numeroNota - 1] = true;
            System.out.println("Nota " + numeroNota + " lançada com sucesso: " + valor);
        } else {
            System.out.println("Número de nota inválido! Use 1, 2 ou 3.");
        }
    }
    
    public void lancarNotas(double nota1, double nota2, double nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        lancada[0] = true;
        lancada[1] = true;
        lancada[2] = true;
    }

        public double calcularMedia() {
        double soma = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (lancada[i]) {
                soma += notas[i];
                count++;
            }
        }
        return count > 0 ? soma / count : 0;
    }

    public void exibirNotas() {
        System.out.println("=== NOTAS DO ALUNO ===");
        exibeDados();
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota " + (i + 1) + ": " + 
                (lancada[i] ? notas[i] : "Não lançada"));
        }
        System.out.println("Média: " + calcularMedia());
    }

    public void adicionarMensalidades(double[] valores) {
        numParcelas = valores.length;
        for (int i = 0; i < numParcelas; i++) {
            mensalidades[i] = new mensalidade(valores[i]);
        }
    }

    public void exibirMensalidades() {
        System.out.println("=== MENSALIDADES ===");
        exibeDados();
        for (int i = 0; i < numParcelas; i++) {
            if (mensalidades[i] != null) {
                System.out.println("Parcela " + (i + 1) + ": R$ " + 
                    mensalidades[i].getValor() + " - " + 
                    (mensalidades[i].isPago() ? "PAGO" : "PENDENTE"));
            }
        }
    }

    public void pagarMensalidade(int indice) {
        if (indice >= 1 && indice <= numParcelas && mensalidades[indice - 1] != null) {
            mensalidades[indice - 1].darBaixa();
            System.out.println("Parcela " + indice + " paga com sucesso!");
        } else {
            System.out.println("Parcela inválida!");
        }
    }
}
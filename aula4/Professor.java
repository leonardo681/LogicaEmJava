public class Professor extends Usuario {

    // Atributo específico do Professor
    private String areaAtuacao;

    // Construtor do Professor — recebe todos os parâmetros do Usuario + o atributo específico
    public Professor(int matatricula, String nome, String login, String senha) {
        // Encaminha os parâmetros para o construtor da superclasse (Usuario)
        super(matatricula, nome, login, senha);
    }

    // Método de acesso (getter) do atributo areaAtuacao
    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    // Método de configuração (setter) do atributo areaAtuacao
    public void setAreaAtuacao(String are) {
        this.areaAtuacao = areaAtuacao;
    }
    
    @Override
    public void exibeDados() {
        super.exibeDados();
        if (areaAtuacao != null && !areaAtuacao.isEmpty()) {
            System.out.println("Área de Atuação: " + areaAtuacao);
        }
    }

}

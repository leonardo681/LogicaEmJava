public class Embarcacao {
    private String nome;
    private String tipo;
    private int anoFabricacao;
    
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void exibeDetalhes() {
        System.out.println("Nome da Embarcação: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }
}

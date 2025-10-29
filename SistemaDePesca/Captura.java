public class Captura {
    private int dataCaptura;
    private int quantidade;
    private String tipoPeixe;
    private String nomePescador;     
    private String nomeEmbarcacao;    

    public int getDataCaptura() { return dataCaptura; }
    public void setDataCaptura(int dataCaptura) { this.dataCaptura = dataCaptura; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public String getTipoPeixe() { return tipoPeixe; }
    public void setTipoPeixe(String tipoPeixe) { this.tipoPeixe = tipoPeixe; }

    public String getNomePescador() { return nomePescador; }
    public void setNomePescador(String nomePescador) { this.nomePescador = nomePescador; }

    public String getNomeEmbarcacao() { return nomeEmbarcacao; }
    public void setNomeEmbarcacao(String nomeEmbarcacao) { this.nomeEmbarcacao = nomeEmbarcacao; }
    
    public void exibeDados() {
        System.out.println("Data da Captura: " + dataCaptura);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Tipo de Peixe: " + tipoPeixe);
    } 
}



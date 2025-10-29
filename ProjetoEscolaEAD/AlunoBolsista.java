public class AlunoBolsista extends Aluno {
    private String tipoBolsa;

    public AlunoBolsista(int codigo, String nome, String dataNascimento, 
                        String email, String senha, String tipoBolsa) {
        super(codigo, nome, dataNascimento, email, senha);
        this.tipoBolsa = tipoBolsa;
    }

    public String getTipoBolsa() 
    { 
        return tipoBolsa; 
    }
    
    public void setTipoBolsa(String tipoBolsa) 
    { 
        this.tipoBolsa = tipoBolsa; 
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Tipo de Bolsa: " + tipoBolsa);
    }

    @Override
    public void exibirMensalidades() {
        System.out.println("=== MENSALIDADES (BOLSISTA) ===");
        super.exibeDados();
        System.out.println("Tipo de Bolsa: " + tipoBolsa);
        for (int i = 0; i < getNumParcelas(); i++) {
            mensalidade m = getMensalidades()[i];
            if (m != null) {
                double valorComDesconto = m.getValor() * 0.5;
                System.out.println("Parcela " + (i + 1) + ": R$ " + 
                    valorComDesconto + " - " + 
                    (m.isPago() ? "PAGO" : "PENDENTE") + " (Bolsa 50%)");
            }
        }
    }
}

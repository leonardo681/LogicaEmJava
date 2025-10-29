public class TesteDesenho {
    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();

        circulo.desenhar();
        retangulo.desenhar();
    }
}
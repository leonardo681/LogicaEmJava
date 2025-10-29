public class Teste
{
    public static void main(String[] args) {
        System.out.println("***INICIO COMPUTADOR***");
        Computador computador1 = new Computador ("Dell","Inspiron",8);
        Computador computador2 = new Computador ("HP","Pavilion",16);
        Computador computador3 = new Computador ("Apple","Macbook",32);
        
        System.out.println("Antes da modificação");
        computador1.exibeDados();
        System.out.println("------------");
        computador1.setMemoriaRAMGB(16);
        computador1.setModelo("Latitude");
        System.out.println("depois de modificação");
        computador1.exibeDados();
        System.out.println("***FIM COMPUTADOR***\n");
        
        System.out.println("***INICIO AUTOMOVEL***");
        Automovel automovel1 = new Automovel ("Toyota","Corolla",2020);
        Automovel automovel2 = new Automovel ("Honda","Civic",2019);
        Automovel automovel3 = new Automovel ("Ford","Focus",2018);
        
        System.out.println("Antes da modificação");
        automovel1.exibeDados();
        System.out.println("------------");
        automovel1.setAno(2016);
        automovel1.setModelo("Camry");
        System.out.println("depois de modificação");
        automovel1.exibeDados();
        System.out.println("***FIM AUTOMOVEL***\n");
        
        
        System.out.println("***INICIO IMOVEL***");
        Imovel imovel1 = new Imovel ("Apartamento",70.5,2);
        Imovel imovel2 = new Imovel ("Casa",150.75,3);
        Imovel imovel3 = new Imovel ("Sobrado",200,4);
        
        System.out.println("Antes da modificação");
        imovel1.exibeDados();
        System.out.println("------------");
        imovel1.setQuartos(6);
        imovel1.setArea(80.0);
        System.out.println("depois de modificação");
        imovel1.exibeDados();
        System.out.println("***FIM IMOVEL***");
    }
    
}
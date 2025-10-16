import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var inteiros = new VetorDinamico(4);
        
        while (true){
            var oQueFazer = gerador.nextInt(2);
            
            switch (oQueFazer) {
                case 0:
                    System.out.println("aicionando...");
                    var elementos = gerador.nextInt(100) + 1;
                    inteiros.adicionar(elementos);
                    break;
            
                case 1:
                    System.out.println("Removendo...");
                    inteiros.remover();
                    break;
            }
            
            System.out.println(inteiros);
            System.out.println("************************************");
            Thread.sleep(2000);
        }

    }
}

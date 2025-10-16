import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;

public class BossiniFy {
    public static void main(String[] args){
        //ArrayLista <Musica> musicas = new ArrayList<Musica>();
        var musicas = new ArrayList<Musica>();
        var leitor = new Scanner (System.in);
        var menu = "1- cadastrar\n2- ver todas (ordenado por nome)\n3- ver todas (ordenado por comprimento)\n4- avaliar\n0- sair";
        
        int op;
        do{
            do{
                System.out.println(menu);
                op = leitor.nextInt();
            }while(op < 0 || op > 3);
            switch (op) {
                case 1:{
                    System.out.println("Titulo:");
                    leitor.nextLine();
                    var titulo = leitor.nextLine();
                    musicas.add(new Musica(titulo));
                    System.out.println("Musica cadastrada!");
                    break;
                }
                case 2:{
                    //ordenar por nome e exibir
                    Collections.sort(musicas);
                    System.out.println(musicas);
                    break;
                }
                case 3:{
                    Collections.sort(musicas, new ComprimentoDoTituloComparator(false));
                    System.out.println(musicas);
                    break;
                }
                case 4:{
                    break;
                }
                case 0:{
                    System.out.println("Ate logo....");
                    break;
                }
                
        
            }
        }while(op != 0);
    }


}

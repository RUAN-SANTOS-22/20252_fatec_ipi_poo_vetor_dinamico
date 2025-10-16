import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ordem para gerar construtores sem argumento e com todos argumentos.
@NoArgsConstructor
@AllArgsConstructor

// cria setter e getter para toda a classe.
@Getter
@Setter
//@ToString                   //comparable é uma interface
public class Musica implements Comparable <Musica>{ //para comparar musicas
    private String titulo;
    private int avaliacao;
    
    Musica(String titulo){
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Musica outra) {
        //graças a classe sring compara por ordem alfabetica
        return this.titulo.compareTo(outra.titulo);
    }
    
}
import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ComprimentoDoTituloComparator implements Comparator <Musica>{
    
    private boolean reverso;
    @Override
    public int compare(Musica m1, Musica m2) {  // comparar por comprimento
        if (reverso){
        return m1.getTitulo().length() < m2.getTitulo().length() ? 1:
        m1.getTitulo().length() == m2.getTitulo().length() ? 0:
        -1;
    }
    }
}

public class VetorDinamico {
    private int [] elementos; 
    private int quantidade; 
    private int capacidade; 
    private static final int CAPACIDADE_MINIMA = 4;// nao eh mais uma variavel de instancia com static
    // final é para constantes

    public VetorDinamico(int capacidadeInicial){
        quantidade = 0;
        if(capacidadeInicial >= CAPACIDADE_MINIMA){
            elementos = new int[capacidadeInicial];
            capacidade = capacidadeInicial;
        }
        else{
            elementos = new int [CAPACIDADE_MINIMA];
            capacidade = CAPACIDADE_MINIMA;
        }
    }

    // private void aumentarCapacidade(){
    //     capacidade = capacidade * 2;
    //     var aux = new int[capacidade];
    //     for (int i = 0; i < quantidade; i++){
    //         aux[i] = elementos[i];
    //     }
    //     elementos = aux;
    // }
    
    private void redimencionar(double fatorRedimencionamento){
        capacidade = (int)(capacidade * fatorRedimencionamento);
        var aux = new int[capacidade];
        for (int i = 0; i < quantidade; i++){
            aux[i] = elementos[i];
        }
    }

    // private void reduzirCapacidade(){
    //     capacidade = capacidade / 2;
    //     var aux = new int[capacidade];
    //     for (int i = 0; i < quantidade; i++){
    //         aux[i] = elementos[i];
    //     }
    // }

    public void remover(){
        if (!estaVazio()){
            quantidade--;
        }
        if(capacidade > CAPACIDADE_MINIMA && quantidade <= capacidade / 4){
            redimencionar(0.5);
        }
    }
    
    public void adicionar(int elemento){
        if(estaCheio()){
            redimencionar(2);
        }
        elementos[quantidade] = elemento;
        quantidade++;
    }

    public boolean estaCheio(){
        return quantidade == capacidade;
    }

    public boolean estaVazio(){
        //ambos funcionam
        //return quantidade <= 0 ? true : false;
        return quantidade <= 0;
    }

    @Override
    public String toString() {
        //montador de string concatena, ele consegue montar uma sequencia de caracter
        
        //StringBuilder sb = new StringBuilder("");
        var sb = new StringBuilder("");
        if(!estaVazio()){
            sb.append("Elementos: ");
            // foreach
            //enhaced for
            // ele itera sobre a coleção inteira se estiver vazio ele coloca um 0
            // for (int elemento : elementos){
            //     // s = s+ elemento + " ";
            //     sb.append(elemento).append(" ");
            // }

            for (int i = 0; i<quantidade; i++){
                sb.append(elementos[i]).append(" ");
            }
        }
        else {
            sb.append("Colecao vazia");
        }

        //sb.append("\n").append("Qtde: ").append(quantidade).append("\n").append("Cap: ").append(capacidade);
        sb
        .append("\n")
        .append("Qtde: ")
        .append(quantidade)
        .append("\n")
        .append("Cap: ")
        .append(capacidade);

        return sb.toString();
    }

}

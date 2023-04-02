package src.br.com.jhon;

public class ListaEncadeada {
    private No primeiro;

    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void adicionar(int valor){
        No novoNo = new No(valor);
        if(primeiro == null){
            novoNo.setValor(valor);
            novoNo.setProximo(primeiro);
            primeiro = novoNo;
        }
        else {
            No atual = primeiro;
            while(atual.getProximo() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    @Override
    public String toString() {
        return "ListaEncadeada: [" + primeiro + ']';
    }
}

package estruturaDeDados;

 class No{
    int info;
    No proximo;

    public No(int info) {
        this.info = info;
        this.proximo = null;
} }

public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;

    }

    public void insereInicio(int i) {
        No novoNo = new No(i);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    public boolean buscaElemento(int i) {
        No atual = inicio;
        while (atual != null){
            if(atual.info == i){
                return true;
            }
            atual = atual.proximo;

        }
        return false;

    }

    public Object buscaIndice(int i) {
        No atual = inicio;
        int indice = 0;

        while (atual != null){
            if (indice == i){
                return atual.info;
            }
            atual = atual.proximo;
            indice++;
        }
        return null;
    }

    public void insereFim(int i) {
        No novNo = new No(i);
        if (inicio == null){
            inicio = novNo;

        }
        else{
            No atual = inicio;
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novNo;
        }
    }

    public void removeInicio() {

    }

    public void removeFim() {

    }

    public void removeIndice(int i) {

    }

    public void insereElementoPosicao(int i, int j) {

    }
    
}
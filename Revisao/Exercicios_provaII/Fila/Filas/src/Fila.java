public class Fila<E> {

    private Celula<E> primeiro;
    private Celula<E> ultimo;

    private static class Celula<E> {
        E elemento;
        Celula<E> proximo;

        Celula(E elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    public void concatenar(Fila<E> outraFila) {
        if (outraFila == null || outraFila.primeiro == null) {
            return; // Nada a concatenar
        }

        if (this.primeiro == null) {
            // A fila atual está vazia, então simplesmente adota a outra
            this.primeiro = outraFila.primeiro;
            this.ultimo = outraFila.ultimo;
        } else {
            // Conecta o final da fila atual ao início da outra
            this.ultimo.proximo = outraFila.primeiro;
            this.ultimo = outraFila.ultimo;
        }
    }

    public int obterNumeroItens() {
        int quantidade = 0;
        Celula<E> tmp = this.primeiro;
        while (tmp != null) {
            quantidade++;
            tmp = tmp.proximo;
        }
        return quantidade;
    }

    public int obterNumeroItensRecursivo(Celula<E> celula) {
        if (celula == null) {
            return 0;
        }
        return 1 + obterNumeroItensRecursivo(celula.proximo);
    }

    public boolean verificarExistencia(E item) {
        Celula<E> tmp = this.primeiro;
        while (tmp != null) {
            if (tmp.elemento.equals(item)) {
                return true;
            }
            tmp = tmp.proximo;
        }
        return false;
    }

    public int obterNumItensAFrente(E item) throws Exception {
        int contador = 0;
        Celula<E> atual = primeiro;

        while (atual != null) {
            if (atual.elemento.equals(item)) {
                return contador;
            }
            contador++;
            atual = atual.proximo;
        }

        // Se chegou até aqui, item não foi encontrado
        throw new Exception("Item não encontrado na fila.");
    }
}

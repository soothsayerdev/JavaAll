
public class ListaEncadeadaSimplesDesordenada <X> implements Cloneable{

    private class No implements Cloneable {
        private X info;
        private No prox;

        public No(X i, No p) {
            this.info = i;
            this.prox = p;
        }

        public No(X i) {
            this.info = i;
            this.prox = null;
        }

        public X getInfo() {
            return info;
        }

        public void setInfo(X i) {
            this.info = i;
        }

        public No getProx() {
            return prox;
        }

        public void setProx(No p) {
            this.prox = p;
        }

        @Override
        public String toString() {
            return this.info.toString();
        }
    }

    private No primeiro;

    public ListaEncadeadaSimplesDesordenada() {
        this.primeiro = null;
    }

    public void guardeNoInicio(X i) throws Exception {
        if (i == null) throw new Exception("Informacao ausente");

        this.primeiro = new No(i, this.primeiro);
    }

    public int getTamanho() {
        if (this.primeiro == null) {
            return 0;
        }
        No atual = this.primeiro;
        int elementos = 0;

        while (atual != null) {
            atual = atual.getProx();
            elementos++;
        }
        return elementos;
    }

    public void remova(int posicao) throws Exception {
        if (posicao < 0 || posicao >= this.getTamanho()) {
            throw new IndexOutOfBoundsException("Posicao invalida!");
        }

        if (posicao == 0) {
            this.primeiro = this.primeiro.getProx();
        }
        else {
            No atual = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProx();
            }

            atual.setProx(atual.getProx().getProx());
        }
    }

    public boolean tem(X i) {
        No atual = this.primeiro;

        while (atual != null) {
            if (atual.getInfo().equals(i)) return true;

            atual = atual.getProx();
        }
        return false;
    }

    public void guardeNoFinal(X i) throws Exception {
        if (i == null) throw new Exception("Informacao ausente");

        if (this.primeiro == null) this.primeiro = new No(i);

        No atual = this.primeiro;
        while (atual.getProx() != null) {
            atual = atual.getProx();
        }
        atual.setProx(new No(i));
    }

    @Override
    public String toString() {
        if (this.primeiro == null) return "[]";

        String ret = "[";

        ret += this.primeiro.getInfo();

        No atual = this.primeiro.getProx();
        while (atual != null) {
            ret += ", " + atual.getInfo();
            atual = atual.getProx();
        }
        return ret+"]";
    }
}



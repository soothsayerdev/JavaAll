public class ListaEncadeadaSimplesDesordenada <X> implements Cloneable{

    private class No implements Cloneable{
        private X info;
        private No prox;

        public No(X i, No p){
            this.info = i;
            this.prox = p;
        }

        public No(X i){
            this.info = i;
            this.prox = null;
        }

        public X getInfo(){

        }
    }

}


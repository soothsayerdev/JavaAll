public class Angulo implements Cloneable, Comparable<Angulo>{
    //private static float pi = 3.141917;
    private float graus;

    public Angulo(){ // assinatura do metodos
    }

    public Angulo(float graus){
        this.graus = graus;
    }

    public float getGraus(){
        return this.graus;
    }

    public void setGraus() throws Exception{
        if(graus < 0 || graus > 360){
            throw new Exception("ERRO: ");
        }
        this.graus = graus;
    }

    public float getRadianos() {
        return this.graus * 3.141592f / 180;
    }

    public float getGrados() {
        return graus * 10 / 9;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Angulo a = (Angulo)obj;

        return this.graus == a.getGraus();
    }

    @Override
    public int hashCode() {
        int ret = 666;

        ret = 7 * ret + Float.valueOf(this.graus).hashCode();

        if (ret < 0) {
            ret -= ret;

        }
        return ret;
    }

    @Override
    public String toString() {
        return "Angulo[graus = " + this.graus + "]";
    }

    @Override
    public int compareTo(Angulo a){
        if(this.graus < a.getGraus()){
            return -666;
        }
        if(this.graus > a.getGraus()) {
            return 666;
        }
        return 0;
    }
    // Construtor de copia para o uso do clone
    public Angulo(Angulo modelo) throws Exception {
        if(modelo == null){
            throw new Exception("Valor invalido: null");
        }
        this.graus = modelo.getGraus();
    }


    // Metodo que cria um objeto diferente ( em um endereço de memoria distinto )
    // do outro com o mesmo conteudo
    @Override
    public Object clone() {
        Angulo a = null;
        
        try {
            a = new Angulo(this);
        }catch (Exception e){

        }
        return a;
    }

}

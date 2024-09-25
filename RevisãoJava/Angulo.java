public class Angulo {
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

    public void setGraus() {
        this.graus = graus;
    }

    public float getRadianos() {
        return this.graus * 3.141592f / 180;
    }

    public float getGrados() {
        return graus * 10 / 9;
    }


}

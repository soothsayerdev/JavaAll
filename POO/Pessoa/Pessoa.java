package POO.Pessoa;

public class Pessoa {
    private String name;
    private int age;
    private float weight;
    private float high;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setHigh(float high){
        this.high = high;
    }

    public float emagrecer(){
        weight -=  0.5;
        return weight;
    }

    public float engordar(){
        weight += 0.5;
        return weight;
    }

    public float fazerAniversario(){
        age += 1;
        if (age > 21){
            high += 0.5;
        }
        return age + high;
    }

    public String toString(){
        return "Pessoa{" +
            " name = " + name +
            ", age = " + age +
            ", weight= " + weight +
            ", high= " + high +
        "}";
    }
}

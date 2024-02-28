package Class;

public class User{

    private int age;
    private string nome;
    private char sexo;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String toString(){
        return "User { +
            "age=" + age +
            ", sexo=" + sexo +
            ", name'" + name + '\'' +
        "}";
    }
}
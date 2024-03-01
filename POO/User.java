package POO;

public class User{

    private int age;
    private String name;
    private char sexo;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String toString(){
        return "User {" +
            "age=" + age +
            ", sexo=" + sexo +
            ", name'" + name + '\'' +
        "}";
    }
}


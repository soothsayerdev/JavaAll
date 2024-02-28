package TestClass;

import Class.User;

public class TestUser{
    public static void main(String[] args){
        User user = new User();

        user.setName("Gustavo");
        user.setAge(21);
        user.setSexo('M');

        System.out.println(user.toString());
    }
}
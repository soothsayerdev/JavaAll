package Pilha;

import java.util.Stack;

public class exemple1 {
    public static void main(String[] args) {
        Stack <String> pilha = new Stack<String>();

        pilha.push("Laranja"); // adiciona elementos 
        pilha.pop(); // tira o ultimo elemento
        pilha.peek(); // ver ultimo elemento

        String topo = pilha.peek();

    }
}

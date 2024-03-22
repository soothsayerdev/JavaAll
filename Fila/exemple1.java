package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class exemple1 {
    public static void main(String[] args) {
        Queue <Integer> fila = new LinkedList<Integer>();
        
        fila.offer(3);
        fila.offer(1); // adiciona elementos

        int primeiro = fila.peek();

    }
}

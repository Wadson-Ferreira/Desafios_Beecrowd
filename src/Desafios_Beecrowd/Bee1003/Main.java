package Desafios_Beecrowd.Bee1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int A,B,SOMA;

        A = Integer.parseInt(reader.readLine());
        B = Integer.parseInt(reader.readLine());

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}

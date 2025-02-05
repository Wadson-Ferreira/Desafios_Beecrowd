package Desafios_Beecrowd.Bee1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int A,B,PROD;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(reader.readLine());
        B = Integer.parseInt(reader.readLine());

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}
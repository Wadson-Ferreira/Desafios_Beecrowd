package Desafios_Beecrowd.Bee1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int A,B,X;

        A = Integer.parseInt(reader.readLine());

        B = Integer.parseInt(reader.readLine());

        X=A+B;

        System.out.printf("X = %d\n", X);
    }
}
package Desafios_Beecrowd.Bee1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double raio;
        double n = 3.14159;
        raio = Double.parseDouble(reader.readLine());
        double area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n", area);
    }
}

package Desafios_Beecrowd.Bee1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double a,b,peso1,peso2,somaDosPesos,media;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        peso1 = 3.5;
        peso2 = 7.5;
        somaDosPesos = peso1 + peso2;

        media = ((a*peso1) + (b*peso2)) / somaDosPesos;
        System.out.printf("MEDIA = %.5f\n", media);


    }
}

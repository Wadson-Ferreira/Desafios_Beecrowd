package Desafios_Beecrowd.Bee1006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double a,b,c,peso1,peso2,peso3,somaDosPesos,media;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Double.parseDouble(reader.readLine());
        b = Double.parseDouble(reader.readLine());
        c = Double.parseDouble(reader.readLine());

        peso1 = 2;
        peso2 = 3;
        peso3 = 5;
        somaDosPesos = peso1 + peso2 + peso3;

        media = ((a*peso1) + (b*peso2) + (c*peso3)) / somaDosPesos;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}

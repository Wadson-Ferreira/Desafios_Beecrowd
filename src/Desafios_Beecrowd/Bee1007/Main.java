package Desafios_Beecrowd.Bee1007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a,b,c,d,diferenca;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());

        diferenca = ((a*b)-(c*d));
        System.out.println("DIFERENCA = " + diferenca);

    }
}

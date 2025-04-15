package Desafios_Beecrowd.Bee1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Peca {
     int codigo;
     int quantidade;
     double valor;

     Peca(int codigo, int quantidade, double valor) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] dados1 = reader.readLine().split(" ");

        Peca p1 = new Peca(
                Integer.parseInt(dados1[0]),
                Integer.parseInt(dados1[1]),
                Double.parseDouble(dados1[2])
        );

        String[] dados2 = reader.readLine().split(" ");
        Peca p2 = new Peca(
                Integer.parseInt(dados2[0]),
                Integer.parseInt(dados2[1]),
                Double.parseDouble(dados2[2])
        );

        double valorTotal = (p1.quantidade * p1.valor) + (p2.quantidade * p2.valor);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

    }
}

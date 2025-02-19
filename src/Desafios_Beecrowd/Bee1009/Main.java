package Desafios_Beecrowd.Bee1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Vendedor {
    private String nomeVendedor;
    private double salarioFixo;
    private double totalDeVendas;
    private double comissaoDeVendas;


    public Vendedor() {
    }


    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public double getComissaoDeVendas() {
        comissaoDeVendas = getTotalDeVendas() * 0.15;
        return comissaoDeVendas;
    }

    public double salarioTotal() {
        return getSalarioFixo() + getComissaoDeVendas();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        Vendedor vendedor = new Vendedor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        vendedor.setNomeVendedor(reader.readLine());
        vendedor.setSalarioFixo(Double.parseDouble(reader.readLine()));
        vendedor.setTotalDeVendas(Double.parseDouble(reader.readLine()));

        double salario = vendedor.salarioTotal();

        System.out.printf("TOTAL = R$ %.2f\n", salario);

    }

}

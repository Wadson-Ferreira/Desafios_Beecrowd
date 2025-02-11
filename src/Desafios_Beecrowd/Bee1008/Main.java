package Desafios_Beecrowd.Bee1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Funcionario {
    private int numeroFuncionario;
    private int salarioPorHora;
    private double horasTrabalhadas;


    public Funcionario() {
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalario() {
        double horasTrabalhadas = getHorasTrabalhadas();
        int salarioPorHora = getSalarioPorHora();
        return (salarioPorHora * horasTrabalhadas);
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        Funcionario funcionario = new Funcionario();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        funcionario.setNumeroFuncionario(Integer.parseInt(reader.readLine()));
        funcionario.setSalarioPorHora(Integer.parseInt(reader.readLine()));
        funcionario.setHorasTrabalhadas(Double.parseDouble(reader.readLine()));


        double salario = funcionario.calcularSalario();

        System.out.println("NUMBER = " + funcionario.getNumeroFuncionario());
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}

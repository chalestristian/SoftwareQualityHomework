package First;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class FolhaPagamento {

    ArrayList<Funcionarios> funcionarios = new ArrayList<>();
    Funcionarios func;
    Scanner input = new Scanner(System.in);
    int n;
    float salarioBase;

    public FolhaPagamento(int n, float salarioBase) {
        this.n = n;
        this.salarioBase = salarioBase;
    }

    public void testaFolhaPagamento() {

        for (int i = 0; i < n; i++) {
            func = inputData((i + 1));
            calcularHoraTrabalhada(func);
            calcularSalarioInicial(func);
            calcularAuxilio(func);
            calcularSalarioFinal(func);
            funcionarios.add(func);
        }

        System.out.println("---------------------------");
        System.out.println("Funcionarios:");
        System.out.println("---------------------------");
        for (Funcionarios funcionario : funcionarios) {
            System.out.println(funcionario.toString());
            System.out.println("---------------------------");
        }

    }

    private Funcionarios inputData(int i) {

        Cargo cargo = null;
        Turno turno = null;

        System.out.println("Informe o nome do funcionário " + i + " : ");
        String nome = input.nextLine();

        System.out.println("Informe as horas trabalhadas do funcionario " + i + " : ");
        float hora = input.nextFloat();

        while (true) {
            System.out.println("Informe o cargo do funcionario " + i + " : ");
            System.out.println(Arrays.toString(Cargo.values()));
            String c = input.next();

            try {
                cargo = Cargo.valueOf(c);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Cargo não existe!");
            }
        }
        while (true) {
            System.out.println("Informe o turno do funcionario " + i + " : ");
            System.out.println(Arrays.toString(Turno.values()));
            String t = input.next();

            try {
                turno = Turno.valueOf(t);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Turno não existe!");
            }
        }

        func = new Funcionarios(nome, hora, turno, cargo);
        func.setCodigo(i);
        Main.limparBuffer(input);
        return func;
    }

    private void calcularHoraTrabalhada(Funcionarios f) {
        float v = 0;
        if (f.getCargo().equals(Cargo.G)) {
            if (f.getTurno().equals(Turno.N)) {
                v = 0.16f;
            } else {
                v = 0.14f;
            }
        } else {
            if (f.getTurno().equals(Turno.N)) {
                v = 0.12f;
            } else {
                v = 0.10f;
            }
        }
        f.setValorHora(salarioBase * v);
    }

    private void calcularSalarioInicial(Funcionarios f) {
        f.setSalarioInicial(f.getHorasTrabalhadas() * f.getValorHora());
    }

    private void calcularAuxilio(Funcionarios f) {
        float aux;
        if (f.getSalarioFinal() < 800) {
            aux = 0.15f;
        } else if (f.getSalarioInicial() >= 800 && f.getSalarioInicial() < 1500) {
            aux = 0.10f;
        } else {
            aux = 0.05f;
        }
        f.setAuxilio(f.getSalarioInicial() * aux);
    }
    private void calcularSalarioFinal(Funcionarios f) {
        f.setSalarioFinal(f.getSalarioInicial() + f.getAuxilio());
    }





}


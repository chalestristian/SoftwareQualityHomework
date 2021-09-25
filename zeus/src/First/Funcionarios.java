package First;

import org.w3c.dom.ls.LSOutput;

public class Funcionarios {

    //Estes são os atributos
    private String nome;
    private int codigo;
    private float numeroHorasTrabalhadas, valorHoraTrabalhada, salarioInicial, salarioFinal, auxilio;
    private Turno turnoTrabalho;
    private Cargo cargoTrabalho;

    //construtor
    public Funcionarios(String nome, float numeroHorasTrabalhadas, Turno t, Cargo c){
        this.nome = nome;
        this.numeroHorasTrabalhadas = numeroHorasTrabalhadas;
        this.turnoTrabalho = t;
        this.cargoTrabalho = c;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSalarioInicial() {
        return this.salarioInicial;
    }

    public void setSalarioInicial(float salario) {
        this.salarioInicial = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getHorasTrabalhadas() {
        return numeroHorasTrabalhadas;
    }

    public float getValorHora() {
        return valorHoraTrabalhada;
    }

    public void setValorHora(float valorHora) {
        this.valorHoraTrabalhada = valorHora;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public float getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(float auxilio) {
        this.auxilio = auxilio;
    }

    public Cargo getCargo() {
        return cargoTrabalho;
    }

    public Turno getTurno() {
        return turnoTrabalho;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Codigo: " + codigo + "\n"
                + "Cargo: " + cargoTrabalho + "\n" + "Turno: " + turnoTrabalho + "\n"  + "HorasTrabalhadas: " + numeroHorasTrabalhadas + "\n"
                + "ValorHora: " + valorHoraTrabalhada + "\n" + "SalarioInicial: " + salarioInicial + "\n"
                + "Auxilio: " + auxilio + "\n" + "SalarioFinal: " + salarioFinal + "\n";
    }

}
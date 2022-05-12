import javax.swing.*;

public class Funcionario {
    private String nome;
    private double salario;

    public void getnome(){
        return name;
    }
    public void setnome(String nome){
        this.nome = nome;
    }

    public void setsalario(double salario){
        this.salario = salario;
    }
    public void getsalario(){
        return salario;
    }
    public double ganhoAnual(){
        double ganho = this.salario *12 ;
        return ganho;

    }
    public void ExibeDados(){
        JOptionPane.showMessageDialog("Nome" + nome + "Tem salario" + salario) ;
    }
}

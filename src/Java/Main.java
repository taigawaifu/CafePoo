package Java;

import javax.swing.*;

public class Main {
    public static void (String [] args){
        Funcionario f = new Tecnico();

        f.setnome("Nikc");
        f.setsalario("1900");
        f.ExibeDados();
        JOptionPane.showMessageDialog(f.ganhaoanual);
        Funcionario f2 = new Tecnico();
    }
}

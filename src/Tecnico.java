public class Tecnico  extends Funcionario{
    public double bonus = 100;

    @Override
    public double ganhoAnual() {
        double ganho;

        ganho = (super getsalario() + bonus);

        return salario;

    }
}

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    public void darBonusSalarial(){
        this.salarioFuncionario += 500.00;
    }
    
}

public class TestEncapsulamento {
    
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Exercicio 01: Conta Bancaria");
        Conta minhaConta = new Conta("Isau Julio");

        //depositando saldo

        minhaConta.depositar(-150.30);
        minhaConta.depositar(150.30);
        System.out.println("O titular " + minhaConta.getTitularConta() + " possui saldo na conta no valor de R$" + minhaConta.getSaldo());
        System.out.println("-------------------------------------------");
        System.out.println(" ");

        System.out.println("-------------------------------------------");
        System.out.println("Exercicio 02: Controle de Produto");
        Produto prod = new Produto("Smartphone", 5400.30);
        prod.setPreco(-800.50);
        prod.setPreco(3800.50);
        System.out.println("O produto " + prod.getNomeProduto() + " sofreu um desconto natalino e no pix voce paga apenas R$" + prod.getPrecoAtual());
        System.out.println("-------------------------------------------");    
        System.out.println(" ");

        System.out.println("-------------------------------------------");
        System.out.println("Exercicio 03: Hierarquia e Protected");
        Gerente funGerente = new Gerente("Regiano Alves", 2500.00);
        System.out.println("O gerente " + funGerente.nomeFuncionario + " possui o salario atual de R$" + funGerente.salarioFuncionario);
        funGerente.darBonusSalarial();
        System.out.println("Agora o gerente " + funGerente.nomeFuncionario + " com o salario bonus foi para R$" + funGerente.salarioFuncionario);
        System.out.println("-------------------------------------------");    
        System.out.println(" ");

        System.out.println("-------------------------------------------");
        System.out.println("Exercicio 04: Sistema de Login");
        Usuario usuario = new Usuario("admin", "12345");
        System.out.println(usuario.getLogin() + " com login correto? " + usuario.autenticar("12345"));    
        System.out.println(usuario.getLogin() + " com login correto? " + usuario.autenticar("6789"));
        System.out.println("-------------------------------------------");    
        System.out.println(" ");

        System.out.println("-------------------------------------------");
        System.out.println("Exercicio 05: Validacao de Email");
        Perfil meuPerfil = new Perfil();
        meuPerfil.setEmail("isaujulio55@gmail.com");
        meuPerfil.setEmail("isaujulio55gmailcom");
        System.out.println("Email atual no sistema: " + meuPerfil.getEmail());
        System.out.println("-------------------------------------------");    
        System.out.println(" ");        
    }
}
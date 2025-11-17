/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    // Construtor
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // Método para exibir dados básicos
    public void exibirDadosBasicos() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}

// Classe Funcionario que herda de Pessoa
class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    // Construtor
    public Funcionario(String nome, String cpf, int idade, double salario, String cargo) {
        super(nome, cpf, idade); // chama o construtor da superclasse
        this.salario = salario;
        this.cargo = cargo;
    }

    // Método para calcular salário anual
    public double calcularSalarioAnual() {
        return salario * 12;
    }

    // Getter para cargo (para uso em subclasses)
    public String getCargo() {
        return cargo;
    }

    // Getter para salário (para uso em subclasses)
    public double getSalario() {
        return salario;
    }
}

// Classe Gerente que herda de Funcionario
class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, String cpf, int idade, double salario, String cargo, String departamento) {
        super(nome, cpf, idade, salario, cargo); // chama o construtor de Funcionario
        this.departamento = departamento;
    }

    // Sobrescrita do método exibirDadosBasicos
    @Override
    public void exibirDadosBasicos() {
        super.exibirDadosBasicos(); // chama o método da classe Pessoa
        System.out.println("Cargo: " + getCargo());
        System.out.println("Departamento: " + departamento);
    }
}




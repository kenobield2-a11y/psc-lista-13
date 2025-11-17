public class TesteHeranca {
    public static void main(String[] args) {
        // Instância de Pessoa
        Pessoa p = new Pessoa("Ana Silva", "123.456.789-00", 30);
        p.exibirDadosBasicos();
        System.out.println("-------------------");

        // Instância de Funcionario
        Funcionario f = new Funcionario("Carlos Souza", "987.654.321-00", 40, 3000.0, "Analista");
        f.exibirDadosBasicos();
        System.out.println("Salário Anual: R$ " + f.calcularSalarioAnual());
        System.out.println("-------------------");

        // Instância de Gerente
        Gerente g = new Gerente("Mariana Costa", "111.222.333-44", 35, 8000.0, "Gerente de Projetos", "TI");
        g.exibirDadosBasicos();
        System.out.println("Salário Anual: R$ " + g.calcularSalarioAnual());
    }
}
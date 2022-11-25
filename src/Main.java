import classes.Funcionario;

public class Main {
    public static void main(String[] args) {
        // Declaração de uma variável do tipo funcionário
        Funcionario funcionario = new Funcionario();
        Funcionario funcionarioPreenchido =
                new Funcionario("Fabricio Valadares",
                        40,
                        3000.50,
                        "Rua Comendador Antônio Alves, 1000, Centro, Pedro Leopoldo -- MG");


        System.out.println("Funcionário Vazio: " + funcionario);
        System.out.println("Funcionário Preenchido: " + funcionarioPreenchido);


        funcionario = new Funcionario("Fabricio Valadares",
                40,
                3000.50,
                "Rua Comendador Antônio Alves, 1000, Centro, Pedro Leopoldo -- MG");

        System.out.println(funcionarioPreenchido.equals(funcionario));
        System.out.println(funcionarioPreenchido == funcionario);
        funcionario = funcionarioPreenchido;
        System.out.println(funcionarioPreenchido == funcionario);

        // Criando o objeto do tipo funcionário
        // que será atribuído à variável de mesmo nome


    }
}
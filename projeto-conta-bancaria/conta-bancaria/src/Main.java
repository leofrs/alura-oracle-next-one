import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String infosOptions = """
                Selecione uma opção abaixo para o que você deseja fazer!
                
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        int saldo = 2000;

        while (true){
            String infosAboutMe = """
                ********************************
                Nome: Leonardo
                Tipo de conta: Conta Corrente
                Saldo: R$ %d
                ********************************
                """.formatted(saldo);

            System.out.println(infosAboutMe);
            System.out.println(infosOptions);

            int options = scanner.nextInt();

            if (options == 1) {
                System.out.println("Seu saldo é: " + saldo);
            }
            else if (options == 2) {
                System.out.println("Digite um valor que deseja receber por pix: ");

                int valorAReceber = scanner.nextInt();
                saldo += valorAReceber;

                System.out.println("Seu novo saldo é: " + saldo);
            }
            else if (options == 4) {
                System.out.println("Muito obrigado pela preferência, volte sempre!");
                break;
            }
        }
    }
}
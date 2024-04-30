import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();

        System.out.print("Número da conta: ");
        conta.setNumero(sc.nextInt());
        System.out.print("Por favor digite o número da Agência: ");
        sc.nextLine();
        conta.setAgencia(sc.nextLine());
        System.out.print("Nome do titular da conta: ");
        conta.setNomeCliente(sc.nextLine());
        System.out.print("Saldo: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println(conta);

        // Sei que o Saldo não deveria ter o método set por medidas de segurança, porém não é este o intuito do desafio.

        sc.close();
    }
}

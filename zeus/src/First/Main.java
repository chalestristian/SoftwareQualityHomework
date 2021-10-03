package First;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int opcao;
            while (true) {
                exibeMenu();
                opcao = input.nextInt();

                switch (opcao) {

                    case 1: // folha de pagamento
                        FolhaPagamento fp = new FolhaPagamento(2, 300);
                        fp.testaFolhaPagamento();
                        break;

                    case 2: // sair
                        System.out.println("ATÉ LOGO!!!!");
                        System.exit(0);
                    default:
                        System.out.println("OPCAO INVALIDA!!!!");
                }
            }
    }

        public static void exibeMenu() {
            System.out.println("-------------------");
            System.out.println("Escolha uma opcao: ");
            System.out.println("[1] Folha de Pagamento");
            System.out.println("[2] Sair");
            System.out.println("-------------------");
        }

        public static void limparBuffer(Scanner scanner) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }
    }




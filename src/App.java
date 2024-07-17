import java.util.Scanner;

public class App {

    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero re = new Numero();

        System.out.printf("%nDigite o valor nuemro 1: ");
        n1.setValor(scan.nextInt());
        System.out.printf("%nDigite o valor nuemro 2: ");
        n2.setValor(scan.nextInt());
        re.setValor(n1.getValor() + n2.getValor());
        System.out.printf("%nA soma de %d com %d e igual a %d", n1.getValor(), n2.getValor(), re.getValor());

    }
}

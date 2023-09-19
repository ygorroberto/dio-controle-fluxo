import java.util.Scanner;
import java.util.Locale;

/**
 * <h3>Contador</h3>
 * Programa que verifica se o segundo número
 * é maior do que o primeiro; caso verdadeiro
 * faz uma interação FOR.
 *
 * @author Ygor roberto Guedes
 *
 * @param Integer parametroUm   - primeiro número
 * @param Integer parametroDois - segundo número
 */
public class Contador {

    public static void main(String[] args)
    {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Informe o primeiro número:");
            int parametroUm = terminal.nextInt();

            System.out.println("Informe o segundo número:");
            int parametroDois = terminal.nextInt();

            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro! \n" + "Mensagem: " + e);
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException
    {
        int contagem = parametroDois - parametroUm;

        if (parametroUm < parametroDois)
        {
            System.out.println("Contando " + contagem + " vezes.");

            for (int i = 1; i <= contagem; i++)
            {
                System.out.println("Imprimindo o número: " + i);
            }
        } else {
            // lançando a exceção caso o primeiro número seja menor do que o segundo número
            throw new ParametrosInvalidosException();
        }

    }
}
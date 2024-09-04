// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário para informar o número a ser verificado
    System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
    int numero = scanner.nextInt();

    // Variáveis iniciais da sequência de Fibonacci
    int a = 0;
    int b = 1;

    // Verificação do número na sequência de Fibonacci
    boolean pertence = false;

    // Continua somando enquanto 'b' é menor ou igual ao número informado
    while (b <= numero) {
        if (b == numero) {
            pertence = true;
            break;
        }
        // Atualiza os valores de 'a' e 'b'
        int temp = b;
        b = a + b;
        a = temp;
    }

    // Exibe o resultado
    if (pertence) {
        System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
    }

    scanner.close();
  }

  
}
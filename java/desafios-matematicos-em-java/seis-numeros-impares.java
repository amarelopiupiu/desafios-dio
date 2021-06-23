// Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso. Entrada: A entrada será um valor inteiro positivo. Saída: A saída será uma sequência de seis números ímpares.
// Exemplo de entrada: 3. Exemplo de saída: 9, 11, 13, 15, 17, 19.

import java.util.Scanner;

public class DesafiosApplication {
public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  int num = entrada.nextInt();
  int vezes = 0;
  while (vezes < 6) {
   if (num % 2 == 1) {
     System.out.println(num);
     vezes++;
    }
    num++; 
   }
}
}


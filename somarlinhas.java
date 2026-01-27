import java.util.Scanner;

public class somarlinhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        //Preencher a matriz
        System.out.println("Digite os 16 numeros da matriz");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Qual linha deseja somar?");
        int linha = sc.nextInt();
        linha--;
        //Aqui vai ficar o codigo pra somar a linha
        int soma = 0;
        for (int j = 0; j < 4; j++){
            soma += matriz[linha][j];
        }
        System.out.println("A soma dos elementos da linha " + (linha + 1) + " é: " + soma);
    }
}

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        // Perguntar quantidade de alunos
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas tem na sala ");
        int Quant = Integer.parseInt(scanner.nextLine());
        // Nomes e idades de alunos
        String nomes[] = new String[Quant];
        int idade[] = new int[Quant];

        for (int i = 0; i < Quant; i++) {
            System.out.println("Nome do aluno: ");
            nomes[i] = sc.nextLine();
            sc.nextLine();

            System.out.println("Idade do aluno: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < Quant; i++) {
            System.out.print(idade[i]);
            System.out.printf(nomes[i]);
        } 

        sc.close();

    }  

}

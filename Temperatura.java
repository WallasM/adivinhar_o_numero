
public class Temperatura {
    public static void main(String[] args) {

        // Declaração de variaveis
        double temperaturaMediaDoAnoAtual = 0;
        double temperaturaMediaDoAnoAnterior = 0;

        // Declaração des vetrores de meses
        String[] meses = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };

        double[] tempAnoAtual = { 25.0, 26.5, 28.0, 30.0, 32.5, 35.0, 36.0, 35.5, 33.0, 30.0, 28.0, 26.0 };
        double[] tempAnoAnterior = { 24.0, 25.5, 27.0, 29.0, 31.5, 34.0, 35.0, 34.5, 32.0, 29.0, 27.0, 25.0 };

        double maiorTemperatura = tempAnoAtual[0];
        double menorTemperatura = tempAnoAtual[0];
        // Calculando temperatura media do ano atual
        double somaAnoAtual = 0;
        double somaAnoAnterior = 0;

        for (int i = 0; i < 12; i++) {
            // Somando as temperaturas para o calculo da media
            somaAnoAtual += tempAnoAtual[i];
            somaAnoAnterior += tempAnoAnterior[i];

            if (tempAnoAtual[i] > maiorTemperatura) {
                maiorTemperatura = tempAnoAtual[i];
            }
            if (tempAnoAtual[i] < menorTemperatura) {
                menorTemperatura = tempAnoAtual[i];
            }
        }

        // Calculando as medias

        temperaturaMediaDoAnoAtual = somaAnoAtual / 12;
        temperaturaMediaDoAnoAnterior = somaAnoAnterior / 12;
        
        System.out.println("Maior temperatura do ano atual " + String.format("%.2f", maiorTemperatura) + "°C");
        System.out.println("Menor temperatura do ano atual " + String.format("%.2f", menorTemperatura) + "°C");

        System.out.println("Temperatura media anual (Ano atual): " + String.format("%.2f", temperaturaMediaDoAnoAtual) + "°C");
        System.out.println("Temperatura media anual (Ano anterior): " + String.format("%.2f", temperaturaMediaDoAnoAnterior) + "°C");
    }
}
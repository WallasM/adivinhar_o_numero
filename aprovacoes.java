public static void main(String[] args){
    double[] medias = {8.5, 4.5, 7.0, 9.2, 5.5};
    double[] frequencias = {90.0, 70.0, 85.0, 100.0, 75.0};

    System.out.println("---Relatório de Aprovação de Alunos---");
    for (int i = 0; i < medias.length; i++){
        double media = medias[i];
        double frequencia = frequencias[i];
        String situacao = verificarSituacao(media, frequencia); 
        String desempenho = classificarDesempenho(media);
        string mencao = obterMencaoHonrosa(media, frequencia);

        System.out.println("\nAluno" + (i + 1) + ":");
        System.out.println(" Média: " + media);
        System.out.println("Frequencia: " + frequencia + "&");
        System.out.println("Desempenho: " + desempenho);
        System.out.println("Menção Honrosa:" + mencao); 
    }
}
    
}    

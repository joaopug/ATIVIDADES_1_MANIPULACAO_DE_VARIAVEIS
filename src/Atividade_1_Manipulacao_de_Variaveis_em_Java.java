public class Atividade_1_Manipulacao_de_Variaveis_em_Java {
    public static void main(String[] args) {

        // Informações do Jonas
        // est = estudante
        String nome = "Jonas";
        int id = 25;
        double alt = 1.55;
        boolean est = true;

        // Informações do Pablo
        String nome2 = "Pablo";
        int id2 = 22;
        double alt2 = 1.80;
        boolean est2 = true;

        // Operações
        // somaIds = soma das idades
        // multAlt = multiplicação da altura
        int somaIds = id + id2;
        double multAlt = alt * 2;

        // Messagens
        // Teatrinho básico pra deixar mais divertido
        System.out.println("Olá, " + nome + "!");
        System.out.println("Você tem " + id + " anos né?");
        System.out.println("Estou vendo aqui que você possui apenas " + alt + "m de altura, ao menos você nunca vai sofrer com pressão alta." );
        System.out.println("Aqui tá dizendo que você também estuda, já que nessa sessão tá: " + est + ". Meio estranho misturar inglês com português, não?");
        System.out.println("Tenho aqui também outro cadidato, o nome dele é " + nome2 + ". Só por curiosidade, decidi somar a sua idade, com a dele, resultou em " + somaIds + " anos. Não chegou nem perto da idade do Taffe.");
        System.out.println("Pra sua altura, " + nome + ", ficar minimamente aceitável, só se ela multiplicar por 2, ficando igual a " + multAlt + " m. Dessa forma tu pode até jogar basquete.");
    }
}
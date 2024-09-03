public class Atividade_2_Calculos_Basicos_e_Manipulacao_de_Variaveis {
    public static void main(String[] args) {

        // Informações
        // traps = armadilhas
        String nome = "Shaolim Matador de Porco";
        int id = 34;
        double sal = 3480.50;
        int mes = 12;
        int traps = 50;
        double gasto = 2000.00;

        // Operações
        double salAno = sal * mes;
        double salLiq = salAno - gasto;
        double trapValor = gasto / traps;

        // Mensagens
        // Teatrinho involvente
        System.out.println("O nome do profissional é " + nome +".");
        System.out.println("Sua idade é " + id + " anos.");
        System.out.println("Ele ganha apenas R$ " + sal + " mensalmente, senhor.");
        System.out.println("O " + nome + " trabalhou " + mes + " meses ano passado,\n" + "resultando num ganho anual de R$ " + salAno + ".");
        System.out.println("Mas não se engane, senhor, este profissional teve R$ " + gasto + "\n" + "em gastos anuais com armadilhas para javalis.");
        System.out.println("No total foram " + traps + " armadilhas utilizadas ao longo do ano,\n" + "dando uma quantia por arabuca de R$ " + trapValor + ".");
        System.out.println("Ou seja, senhor, ele apenas recebeu liquidamente R$ " + salLiq + ",\n" + "ele está totalmente quebrado.");
        System.out.println("Devemos contratá-lo, Sr. Wayne?");
    }
}
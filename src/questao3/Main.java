package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opcao;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("<1> Cadastrar Projeto Distribuir Alimentos");
            System.out.println("<2> Cadastrar Projeto Trabalho Voluntário");
            System.out.println("<3> Sair");
            opcao = entrada.nextLine();

            if (opcao.equals("1")) {

                DistribuicaoAlimento da = new DistribuicaoAlimento("Mesa Brasil", "SESC", "Belo Horizonte", "01/09/2023", "30/09/2023", "Feijão", 10.0F);

                System.out.println(da.validaProjeto());
                System.out.println("\nDistribuição de alimento\n" + da.imprimeProjeto());


            }
            if (opcao.equals("2")) {

                TrabalhoVoluntario tv = new TrabalhoVoluntario("Mesa Brasil", "SESC", "BH", "01/09/2023", "30/09/2023", "Entregador", 6);

                System.out.println(tv.validaProjeto());
                System.out.println("\nTrabalho voluntario\n" + tv.imprimeProjeto());


            }

            if (opcao.equals("3")) {
                System.out.println("Você escolheu sair.");
            }

            if(!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")){
                System.out.println("Opção inválida");
            }

        } while (!opcao.equals("3"));
    }
}

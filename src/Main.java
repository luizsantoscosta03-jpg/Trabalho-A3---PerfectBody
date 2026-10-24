import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();
        int opcao;

        System.out.println("==============================");
        System.out.println("         BODYPERFECT");
        System.out.println();
        System.out.println("       System for academy");
        System.out.println("==============================");

        do {
            System.out.println();
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Buscar aluno por matrícula");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();

                System.out.print("Digite a idade: ");
                int idade = sc.nextInt();

                System.out.print("Digite o peso (kg): ");
                double peso = sc.nextDouble();

                System.out.print("Digite a altura (m): ");
                double altura = sc.nextDouble();

                System.out.println("Nível: 1 - Iniciante | 2 - Intermediário | 3 - Avançado");
                System.out.print("Escolha: ");
                int nivel = sc.nextInt();
                sc.nextLine();

                Aluno aluno;
                if (nivel == 1) {
                    aluno = new AlunoIniciante(nome, idade, peso, altura);
                } else if (nivel == 2) {
                    aluno = new AlunoIntermediario(nome, idade, peso, altura);
                } else {
                    aluno = new AlunoAvancado(nome, idade, peso, altura);
                }

                alunos.add(aluno);
                System.out.println("Aluno cadastrado! Matrícula: " + aluno.getMatricula());

            } else if (opcao == 2) {
                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    for (Aluno a : alunos) {
                        System.out.println("------------------------------");
                        System.out.println("Matrícula: " + a.getMatricula());
                        System.out.println("Aluno: " + a.getNome());
                        System.out.printf("IMC: %.2f%n", a.calcularImc());
                        System.out.println("Classificação: " + a.classificar());
                        System.out.println("Treino: " + a.gerarTreino());
                    }
                    System.out.println("------------------------------");
                }

            } else if (opcao == 3) {
                System.out.print("Digite a matrícula: ");
                int busca = sc.nextInt();
                sc.nextLine();

                Aluno encontrado = null;
                for (Aluno a : alunos) {
                    if (a.getMatricula() == busca) {
                        encontrado = a;
                    }
                }

                if (encontrado == null) {
                    System.out.println("Matrícula não encontrada.");
                } else {
                    System.out.println("------------------------------");
                    System.out.println("Matrícula: " + encontrado.getMatricula());
                    System.out.println("Aluno: " + encontrado.getNome());
                    System.out.println("Idade: " + encontrado.getIdade());
                    System.out.printf("IMC: %.2f%n", encontrado.calcularImc());
                    System.out.println("Classificação: " + encontrado.classificar());
                    System.out.println("Treino: " + encontrado.gerarTreino());
                    System.out.println("------------------------------");
                }

            } else if (opcao == 0) {
                System.out.println("Até logo!");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
public class AlunoIniciante extends Aluno {
    public AlunoIniciante(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public String gerarTreino() {
        return "Iniciante: full body 3x por semana, 20 min de caminhada";
    }
}
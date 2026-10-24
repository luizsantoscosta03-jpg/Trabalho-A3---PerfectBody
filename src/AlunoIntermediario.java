public class AlunoIntermediario extends Aluno {
    public AlunoIntermediario(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public String gerarTreino() {
        return "Intermediário: divisão A/B/C, 4x por semana, 30 min de cardio";
    }
}
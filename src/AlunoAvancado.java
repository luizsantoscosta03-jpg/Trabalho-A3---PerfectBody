public class AlunoAvancado extends Aluno {
    public AlunoAvancado(String nome, int idade, double peso, double altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public String gerarTreino() {
        return "Avançado: divisão por grupo muscular, 5x por semana, cardio intervalado";
    }
}
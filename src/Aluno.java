public class Aluno {
    private static int proximaMatricula = 1;

    private int matricula;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.matricula = proximaMatricula;
        proximaMatricula++;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String classificar() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public String gerarTreino() {
        return "Treino geral";
    }
}
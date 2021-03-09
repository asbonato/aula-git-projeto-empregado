public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public double calculaSalario() {
        if (tipo == 1) {
            return salario;
        } else if (tipo == 2) {
            // comissão varia de 0 a 1, é um percentual sobre o salário
            return salario + salario * comissao;
        } else if (tipo == 3) {
            return salario + bonus;
        } else {
            return 0.;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int tipo() {
        return this.tipo;
    }
}
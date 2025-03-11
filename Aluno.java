
package exercicios.pessoa;


public class Aluno extends Pessoa {
    
   private String matricula;

    
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    
    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome); 
        System.out.println("Idade: " + getIdade()); 
        System.out.println("Matrícula: " + matricula);
    }
}

    


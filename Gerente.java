package Funcionario;
public class Gerente extends Funcionario {
    
private String  telefone;
private int idade;

public Gerente(String nome, String telefone, int idade) {
    super(nome);
    this.telefone = telefone;
    this.idade = idade;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}
@Override
public double calcularSalario() {
    
    return 8000;
}

public void exibirInfo(){
System.out.println("\no nome do gerente é: "+ getNome()+ "\no telefone é: "+getTelefone()+"\na idade do gerente é "+ getIdade()+ "\nSALARIO DO GERENTE É "+calcularSalario());

}
}

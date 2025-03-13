package Funcionario;
public class Progamador extends Funcionario {

    private String nivel;
    private String IdProgramador;

    public Progamador(String nome, String nivel, String idProgramador) {
        super(nome);
        this.nivel = nivel;
        IdProgramador = idProgramador;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getIdProgramador() {
        return IdProgramador;
    }

    public void setIdProgramador(String idProgramador) {
        IdProgramador = idProgramador;
    }
    @Override
    public double calcularSalario() {
        return 5000 + 200;
    }

    public void exibirInfo() {
        System.out.println(" \no nome do programador é " + getNome() + "\n o nivel do prgramador é " + getNivel()
                + " \no id do programador é " + getIdProgramador() +"O SALARIO DO PRORAGAMADOR É"+ calcularSalario());

    }

}
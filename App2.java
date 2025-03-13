package Funcionario;
public class App2 {
   public static void main(String[] args) {
    Gerente gerente = new Gerente("Atila", "16661545", 15);
    Progamador progamador = new Progamador("João", "pleno", "1236");

    progamador.exibirInfo();
    gerente.exibirInfo();
    
   } 
}

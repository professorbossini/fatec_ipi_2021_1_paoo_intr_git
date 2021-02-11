import javax.swing.JOptionPane;
public class EntregaGit{
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog ("Qual o seu nome?");
    JOptionPane.showMessageDialog(null, "Bem vindo " + nome);
    System.out.println("Entregando tarefas com o Git na linha de comando");
    //teste
    //outro teste
  }
}
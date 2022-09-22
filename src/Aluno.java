import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class Aluno {
    public String nome;
    public String email;
    public int idade;

    void cadastrarAluno() {
        nome = JOptionPane.showInputDialog(null, "Nome do Aluno: ");
        email = JOptionPane.showInputDialog(null, "Email: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: : "));
    }

}

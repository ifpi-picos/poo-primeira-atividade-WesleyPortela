import javax.swing.JOptionPane;

public class Professor {
    public String nome;
    public String cursoP;
    public String emailP;

    void cadastrarProf() {
        nome = javax.swing.JOptionPane.showInputDialog(null, "Nome do Professor: ");
        cursoP = javax.swing.JOptionPane.showInputDialog(null, "Curso: ");
        emailP = javax.swing.JOptionPane.showInputDialog(null, "Email: : ");

    }
}
import java.util.Date;
import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class Curso {
    public static Object curso1;
    public String nome;
    public String modalidade;
    public String nivel;
    public int cargaHoraria;
    public Date dataDeInicio;
    public Date dataDeTermino;
    public boolean gratuito = true;

    void cadastrarCurso() {
        nome = javax.swing.JOptionPane.showInputDialog(null, "Nome do Curso: ");
        modalidade = javax.swing.JOptionPane.showInputDialog(null, "Modalidade: ");
        nivel = javax.swing.JOptionPane.showInputDialog(null, "Nivel: ");
        cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog(null, "Carga Horaria: "));
    }
}

import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1.cadastrarAluno();

        JOptionPane.wshowMessageDialog(null, "Parabéns, " + aluno1.nome + ", seus dados foram cadastrados!");
        JOptionPane.showMessageDialog(null, "Vamos dar inicio ao cadastro do Curso.");

        Curso curso1 = new Curso();
        curso1.cadastrarCurso();

        JOptionPane.showMessageDialog(null,
                "Olá " + aluno1.nome + ", seja bem vindo au curso de " + curso1.nome
                        + ". vamos tentar emitir seu certificado agora!");

        Certificado c1 = new Certificado();
        c1.validCertificado();

    }

}
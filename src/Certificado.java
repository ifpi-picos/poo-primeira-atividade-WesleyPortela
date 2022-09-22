import java.sql.Date;
import java.lang.Integer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Certificado {
    public int dia;
    public int mes;
    public int ano;
    // public Calendar dataAtual = Calendar.getInstance();

    void validCertificado() {
        JOptionPane.showMessageDialog(null, "OK, vamos validar a sua data de termino do seu curso!\nPronto?\n");
        JOptionPane.showMessageDialog(null, "Lembre-se que todos os dados devem ser em formato numerico, vamos la!");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o mês: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano: "));
        // Date hoje = dataAtual.getTime();

    }

    /**
     * @return
     */
    Void gerarCertificado() {
        Object aluno1;
        Object curso1;
        // if ((dataAtual - dataDeTermino) >= 0) {
        JOptionPane.showMessageDialog(null,
                "O Aluno " + aluno1.nome + ", terminou o curso de " + curso1.nome + ", com a carga horaria de "
                        + curso1.cargaHoraria + " horas, data de conclusão " + dia + "/" + mes + "/" + ano);
        // } else {
        // System.out.println("O certificado não pode ser emitido antes do termino do
        // Curso!\n");
        // System.out.println("Porfavor verifique a data de término.\n");
    }
}

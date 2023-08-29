import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Turista mochileiro = new Turista("Supla");
        Turista mochileira = new Turista();

        // Definir forma de cada turista

        mochileiro.setCpf(Validacao.cpf("124"));

        mochileira.setCpf("235");
        mochileira.setNome("namor");

        String retorno = mochileira.viajar();



        JOptionPane.showMessageDialog(null, retorno);

    }

}
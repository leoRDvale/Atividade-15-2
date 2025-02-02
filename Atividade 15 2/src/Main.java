import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que utilize uma FILA dinâmica para verificar se expressões aritméticas estão com a parametrização correta. O programa deve verificar expressões para ver se cada  “abre parênteses”  tem um “fecha parênteses” correspondente.
         Ex.:Correto:  (  (  )  )  –  (  (  ) (  )  )  –  (  )  (  )
         Incorreto:  ) (  –  (  (  )  (  –  )  )  (  (
         */


        String expressao;
        expressao = JOptionPane.showInputDialog(null, "Digite uma expressão para verificar se os parênteses estão corretos:");

        if (VerificarParenteses.verificarExpressao(expressao)) {
            JOptionPane.showMessageDialog(null, "A expressão está com os parênteses corretos.");
        } else {
            JOptionPane.showMessageDialog(null, "A expressão NÃO está com os parênteses corretos.");
        }

    }



}
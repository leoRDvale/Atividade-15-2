import java.util.LinkedList;
import java.util.Queue;

public class VerificarParenteses {

    public static boolean verificarExpressao(String expressao) {
        Queue<Character> fila = new LinkedList<>();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '(') {
                fila.add(c);
            } else if (c == ')') {
                if (fila.isEmpty()) {
                    return false;
                }
                fila.poll();
            }
        }
        return fila.isEmpty();
    }

}


package exerc03_10nov;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex S. Maziero M.
 */
public class AnaliseSolo {
    
    public void exibeResultado(float pontuacao) {
        String resultado;
        if (pontuacao <= 10) {
            resultado = "Rochosa";
        } else if (pontuacao > 10 & pontuacao <= 40) {
            resultado = "Firme";
        } else if (pontuacao > 40 & pontuacao <= 80) {
            resultado = "Pantanosa";
        } else 
            resultado = "pontuacao da agua invalida!";
        
        JOptionPane.showMessageDialog(null, String.format("Resultado da amostra: %s", resultado));
    };
    
}

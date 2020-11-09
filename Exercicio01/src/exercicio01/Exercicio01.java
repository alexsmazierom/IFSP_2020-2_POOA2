package exercicio01;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Sandro Maziero Minto
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
            Enunciado do Algoritmo.
            Faça um programa que receba três notas e seus respectivos pesos.
            Calcule e mostre a média ponderada dessas notas.

        */
        
        float[] notas = {0,0,0};
        float[] pesos = {0,0,0};
        
        float somaProdutos = 0;
        float somaPesos = 0;
        
        for (int i = 0; i < 3; i++) {
            notas[i] = Float.parseFloat( JOptionPane.showInputDialog("Informa a Nota 1/" + (i+1) + ": ") );
            pesos[i] = Float.parseFloat( JOptionPane.showInputDialog("Informa o Peso 1/" + (i+1) + ": ") );
            somaProdutos += (notas[i] * pesos[i]);
            somaPesos += pesos[i];
        }
        
        float media = somaProdutos / somaPesos;
        
        JOptionPane.showMessageDialog(null, "Média aritmetica (ponderada): " + media);     
        
    }
    
}

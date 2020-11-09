package exerc01_27out;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex Sandro Maziero Minto
 */
public class Principal_Nota {

    public static void main(String[] args) {
        /*
            Enunciado do Algoritmo.
            Faça um programa que receba três notas e seus respectivos pesos.
            Calcule e mostre a média ponderada dessas notas.
        */
        System.out.println("exerc01_27out.Principal_Nota.main()");
        
        float[] notas = {0,0,0};
        float[] pesos = {0,0,0};
        
        System.out.println("    prompt usuario notas/pesos");
        
        for (int i = 0; i < 3; i++) {
            notas[i] = Float.parseFloat( JOptionPane.showInputDialog("Informe a Nota " + (i+1) + ": ") );
            pesos[i] = Float.parseFloat( JOptionPane.showInputDialog("Informe o Peso " + (i+1) + ": ") );        
        }        
        
        Nota nota = new Nota();
        nota.adicionarNotas(notas[0], notas[1], notas[2]);
        nota.adicionarPesos(pesos[0], pesos[1], pesos[2]);
        String media = nota.obterMedia();
        
        JOptionPane.showMessageDialog(null, media);
        
    }
    
}

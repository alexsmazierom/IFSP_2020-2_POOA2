package exerc02_03nov;

import javax.swing.JOptionPane;

/**
 *
 * @author alexs
 */
public class Principal_Funcionario {
    
    public static void main(String[] args) {
        System.out.println("exerc02_03nov.Principal_Funcionario.main()");
        
        float salario = Float.parseFloat( JOptionPane.showInputDialog("Informe o Salario (R$): ") );
        float percentual = Float.parseFloat( JOptionPane.showInputDialog("Informe o reajuste (%): ") );
        
        Funcionario funcionario = new Funcionario();
        funcionario.aumentarSalario(salario, percentual);
        funcionario.exibirSalario();
        
    }
    
}


package exerc02_03nov;

import javax.swing.JOptionPane;

/**
 *
 * @author alexs
 */
public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario() {
        this.salario = (float) 0.00;
    }
    
    public void aumentarSalario(float salario, float percentual) {
        System.out.println("exerc02_03nov.Funcionario.aumentarSalario()");
        System.out.println(String.format("    salario: %.2f, perc: %.2f", salario, percentual));
        float salarioReajustado = salario * (1+(percentual/100));
        System.out.println(String.format("    salario reajustado: %.2f", salarioReajustado));
        this.salario = salarioReajustado;
    }
    
    public void exibirSalario() {
        System.out.println("exerc02_03nov.Funcionario.exibirSalario()");
        JOptionPane.showMessageDialog(null, String.format("Salario (R$): %.2f", this.salario));
    }
}

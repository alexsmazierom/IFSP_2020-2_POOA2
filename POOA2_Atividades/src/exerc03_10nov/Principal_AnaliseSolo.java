
package exerc03_10nov;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex S. Maziero M.
 */
public class Principal_AnaliseSolo {
    
    public static void main(String[] args) {
        /*
            Você está fazendo um trabalho de classificação de solo.
            Após colher uma amostra e verificar a pontuação de água presente nela, classificou a amostra em:
                Rochosa: se menos ou igual a 10 pontos de água;
                Firme: se mais do 10 pontos e menor ou igual a 40 pontos;
                Pantanosa: se mais do 40 pontos e menor ou igual a 80 pontos;
                Caso seja maior que 80 pontos escrever a mensagem: "Quantidade de água inválida".
        */
        System.out.println("exerc03_10nov.Principal_Analise.main()");
        
        float pontuacao = Float.parseFloat( JOptionPane.showInputDialog("Informe a pontuacao de agua na amostra: ") );
        
        AnaliseSolo analise = new AnaliseSolo();
        analise.exibeResultado(pontuacao);
        
        
    }
}

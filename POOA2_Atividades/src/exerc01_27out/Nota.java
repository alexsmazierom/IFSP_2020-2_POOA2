/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc01_27out;

/**
 *
 * @author Alex Sandro Maziero Minto
 */
public class Nota {
    private float nota1 = 0;
    private float nota2 = 0;
    private float nota3 = 0;
    private float peso1 = 1;
    private float peso2 = 1;
    private float peso3 = 1;
    
    public void adicionarNotas(float n1, float n2, float n3) {
        System.out.println("exerc01_27out.Nota.adicionarNotas()");
        System.out.println(String.format("    notas: %.1f, %.1f, %.1f", n1, n2, n3));
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }
    
    public void adicionarPesos(float p1, float p2, float p3) {
        System.out.println("exerc01_27out.Nota.adicionarPesos()");
        System.out.println(String.format("    pesos: %.1f, %.1f, %.1f", p1, p2, p3));
        this.peso1 = p1;
        this.peso2 = p2;
        this.peso3 = p3;
    }
    
    public String obterMedia() {
        System.out.println("exerc01_27out.Nota.obterMedia()");
        float notas = (this.nota1 * this.peso1)
                    + (this.nota2 * this.peso2)
                    + (this.nota3 * this.peso3);
        float pesos = this.peso1 + this.peso2 + this.peso3;
        float media = notas / pesos;
        System.out.println(String.format("    produto (notas*pesos): %.1f", notas));
        System.out.println(String.format("    soma pesos: %.1f", pesos));
        System.out.println(String.format("    media ponderada: %.1f", media));
        return String.format("Media (ponderada): %.1f", media);
    }
    
}

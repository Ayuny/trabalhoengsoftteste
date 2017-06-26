/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoteste;

/**
 *
 * @author mkLNote
 */
public class Calculo {
    
    public void testaCalculo () {
        System.out.println("Valores x=2 e y=2 | "
                + "resultado esperado = 4,0.93 |"
                + "Resultado do calculo ="+calculo(2,2));
        //-----
        System.out.println("Valores x=8  y=0 | "
                + "resultado esperado = 8,372 |"
                + "Resultado do calculo ="+calculo(8,0));
        //-----
        System.out.println("Valores x=173 e y=98 | "
                + "resultado esperado = 279,04449999999997 |"
                + "Resultado do calculo ="+calculo(173,98));
    }
    
    public double calculo(int valor, int frete) {
        
        return ((valor*1.0065)-valor)+((valor*1.03)-valor)+((valor*1.01)-valor)+valor+frete;
    }
    
    
}

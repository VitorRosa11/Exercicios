

package exercicios.main;


public class Main {

    public static void main(String[] args) {
        
package exerciciosobrecarga;

public class Main {
    public static void main(String[] args) {
       
        Calculadora calc = new Calculadora();

       
        int resultado1 = calc.multiplicar(5, 3);
        int resultado2 = calc.multiplicar(2, 4, 6);
        double resultado3 = calc.multiplicar(2.5, 3.2);

       
        System.out.println("Multiplicação de dois inteiros: " + resultado1);
        System.out.println("Multiplicação de três inteiros: " + resultado2);
        System.out.println("Multiplicação de dois doubles: " + resultado3);
    }
}


package Formas;


public class Main {
    
public static void main(String[] args) {
        
        Circulo circulo = new Circulo("Vermelho");
        circulo.definirDimensoes(5); 
        System.out.println("Área do Círculo: " + circulo.calcularArea());

        
        Retangulo retangulo = new Retangulo("Azul");
        retangulo.definirDimensoes(4, 6); 
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
    }
}


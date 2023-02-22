package opquebrados;

import java.util.Scanner;

public class main {
    public static GUI_CrearQuebrados crear = new GUI_CrearQuebrados();
    public static GUI_Operaciones opera = new GUI_Operaciones();
    public static Quebrado queb1 = new Quebrado(0, 0);
    public static Quebrado queb2 = new Quebrado(0, 0);
    public static OpQuebrados queb = new OpQuebrados(queb1, queb2);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Operacion de quebrados \n Anade los quebrados");
        System.out.println("Quebrado 1");
        System.out.println("Numerador : ");
        int num = sc.nextInt();
        System.out.println("Denominador : ");
        int den = sc.nextInt();
        Quebrado queb1 = new Quebrado(num, den);
        System.out.println("Quebrado 2");
        System.out.println("Numerador : ");
        num = sc.nextInt();
        System.out.println("Denominador : ");
        den = sc.nextInt();
        Quebrado queb2 = new Quebrado(num, den);
        OpQuebrados n = new OpQuebrados(queb1, queb2);
        System.out.println("Elije el metodo");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        int resp = sc.nextInt();
        switch (resp) {
            case 1:
                System.out.println("La suma es : ");
                System.out.println("" + n.suma());
                
                break;
            case 2:
                System.out.println("La resta es : ");
                System.out.println("" + n.resta());
                break;
            case 3:
                System.out.println("La multiplicacion es : ");
                System.out.println("" + n.multiplicacion());                
                break;
            case 4:
                System.out.println("La division es : ");
                System.out.println("" + n.division());
                break;
            default:
                throw new AssertionError();
        }*/
               
        crear.setVisible(true);

        
         
        
    }
    
    
}

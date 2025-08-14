import java.util.Scanner;

public class calculadora2 {
    
    public static void main(String[] args) {

        int num1;
        int num2; 
        int suma, resta, multiplicacion,division;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer dato ");
        num1 = entrada.nextInt();

        System.out.println("Ingrese el segundo dato");
        num2 = entrada.nextInt();

        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;


        System.out.println("La suma es :" + suma);
        System.out.println("La resta es :"+ resta);
        System.out.println("La multipilcaion es "+ multiplicacion);
        System.out.println("La divison es " + division);
        
    }
}

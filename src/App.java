
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float Numero1 = 0;
        float Numero2 = 0;
        int ope = 0;
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        Numero1 = sc.nextFloat();
        System.out.println("Escriba el segundo numero");
        Numero2 = sc.nextFloat();
        System.out.println("si queres realiar una operacion escriba la lectra correspondiente: 3: sumar, 4. restar, 5: multiplicar, 6 division,");
        ope  = sc.nextInt();

        Calculadora oper = new Calculadora(Numero1, Numero2);
        float resul = 0; 

        switch(ope) {
            case 3: resul = oper.suma(); break;
            case 4: resul = oper.resta(); break;
            case 5: resul = oper.multiplicacion(); break;
            case 6: resul = oper.division(); break; 

        }
        System.out.println("El resultado es "+resul);
    }
    

}

import java.util.Scanner;
public class ParOuImpar {

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se é par ou impar:");
        int numero = sc.nextInt();
        par_impar(numero);
    }

    public static void par_impar(int numero){
        if (numero%2 == 0){
            System.out.println("o numero é par");

        }
        else {
            System.out.println("o numero é impar");
        }
    }
}

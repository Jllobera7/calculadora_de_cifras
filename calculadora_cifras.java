import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un número entero, por favor:");
        int numero= scanner.nextInt();
        int numeroCifras = 0;
         while (numero != 0) {
             numero = numero / 10;
             numeroCifras = numeroCifras + 1;
         }
             System.out.println("el numero anteriormente introducido tiene: " + numeroCifras+" cifras");
    }
}

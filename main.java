import java.util.Scanner;

class Main{

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pon un numero: ");
        
        try {
        double input = scanner.nextDouble();
        double result = input*50+6;
        System.out.println(result);
        
          } catch (Exception e) {
            System.out.println("Input invalido");
          }
    }
}

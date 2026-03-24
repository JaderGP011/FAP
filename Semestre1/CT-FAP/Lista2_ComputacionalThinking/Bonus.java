import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("tarefa da rotina");
        String tarefa = in.next();

        System.out.println("dia: ");
        int dia = in.nextInt();
        System.out.println("mes");
        int mes = in.nextInt();

        System.out.println("ano");
        int ano = in.nextInt();

        // verificação da data
        if (dia >31) {
            System.out.println("Data inválida");
        } else {
            if (dia == 31 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                
            }
        }
        in.close();
    }
}

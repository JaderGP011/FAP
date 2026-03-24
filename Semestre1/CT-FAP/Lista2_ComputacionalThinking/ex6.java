public class ex6 {
    public static void main(String[] args) {
        double l1 = 9;
        double l2 = 8.9;
        double l3 = 9;

        // verificando se os valores dao um triangulo
        if (l1 + l2 > l3 && l2 + l3 > l1 && l1 + l3 > l2) {

            if (l1 == l2 && l1 == l3 && l2 == l1 && l2 == l3 && l3 == l1 && l1 == l2) {
                System.out.println("Triângulo Equiláatero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo Isóceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.err.println("Não é possível formar um triângulo!");
        }
    }
}
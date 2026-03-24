public class ex8 {
    public static void main(String[] args) {
        double peso = 80;
        double altura = 1.75;

        // calculo
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Peso normal");
        } else if (imc <=29.9 ) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Sobrepeso");
        } else if (imc <=34.9 ) {
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9){
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Obesidade grau 2");
        }else if (imc >=40){
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Obesidade grau 3");
        }
    }
}

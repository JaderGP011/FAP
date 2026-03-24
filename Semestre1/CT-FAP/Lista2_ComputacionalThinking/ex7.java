public class ex7 {
    public static void main(String[] args) {
        double valorDaCompra = 500.8;
        double valorFinal = 0;
        double desconto = 0;
        
        if (valorDaCompra <= 100 ) {
            valorFinal = valorDaCompra;
            System.out.printf("Valor Original: %.2f\n Desconto: %.2f%%\n Valor final: %.2f\n", valorDaCompra, desconto * 100, valorFinal);
        } else if (valorDaCompra > 200) {
            desconto = 0.20;
            valorFinal = valorDaCompra - (valorDaCompra * desconto);
            System.out.printf("Valor Original: %.2f\n Desconto: %.2f%%\n Valor final: %.2f\n", valorDaCompra, desconto * 100, valorFinal);
        } else {
            desconto = 0.10;
            valorFinal = valorDaCompra - (valorDaCompra * desconto);
            System.out.printf("Valor Original: %.2f\n Desconto: %.2f%%\n Valor final: %.2f\n", valorDaCompra, desconto * 100, valorFinal);
        }
    }
}

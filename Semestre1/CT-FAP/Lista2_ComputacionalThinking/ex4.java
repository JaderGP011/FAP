public class ex4 {
    public static void main(String[] args) {
        final String SENHA_CORRETA = "1234";
        String senha = "8520";

        if (senha == SENHA_CORRETA) {
            System.out.println("Acesso Permitido.");
        } else {
            System.out.println("Senha Incorreta.");
        }
    }
}

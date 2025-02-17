package je05_tipos_wrapers;

public class StringParaNumero {
    public static void main(String[] args) {
        /* Convertendo Tipos Númericos para String */
        String numero = "100";
        Integer.parseInt(numero);
        System.out.println(numero);

        // Integer.parseDouble()
        String numero1 = "100";
        Double.parseDouble(numero1);
        System.out.println(numero1);

        // valueOF
        String numero2 = "200";
        Integer.valueOf(numero2);
        System.out.println(numero2);
    }
}

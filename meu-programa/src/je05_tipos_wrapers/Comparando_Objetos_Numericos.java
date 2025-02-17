package je05_tipos_wrapers;

public class Comparando_Objetos_Numericos {
    public static void main(String[] args) {

        // Usando o equals()
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf(100);
        System.out.println(obj1.equals(obj2)); // true, porque os dois objetos são iguais.

        // Usando o compareTo()
        Integer obj3 = 100;
        Integer obj4 = 100;
        System.out.println(obj3.compareTo(obj4)); // 0

        // Operadores Logicos
        Integer obj5 = 100;
        Integer obj6 = 100;
        System.out.println(obj5 > obj6); // 0







    }

}

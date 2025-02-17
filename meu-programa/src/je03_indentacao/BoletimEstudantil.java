package je03_indentacao;

public class BoletimEstudantil {
    public static void main(String[] args) {

        // Sem identação
int notaProva = 6;
if(notaProva<6){
System.out.println("REPROVADO");
}
else if(notaProva==6){
System.out.println("PROVA DE MINERVA");
}
else {
System.out.println("APROVADO");
}

        // Com identação
        int notaProva2 = 6;
        if(notaProva2<6){
            System.out.println("REPROVADO");
        }
        else if(notaProva2==6){
            System.out.println("PROVA DE MINERVA");
        }
        else {
            System.out.println("APROVADO");
        }
    }
}

package PraticasSemPoo;

public class TestandoConversao {

    public static void main (String[] args){
        double salario = 1270.50;
        int valor = (int) salario; // para converter coloque (e o tipo da variavel)
        System.out.println(valor);

        long numero = 9000000000000000000l; // maximo
        short valorPequeno = 2131;// maximo
        byte bity = 127; //maximo


        double vl1 = 0.2;
        double vl2 = 0.1;
        System.out.println(vl1 + vl2);
    }
}

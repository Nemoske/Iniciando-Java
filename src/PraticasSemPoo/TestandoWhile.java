package PraticasSemPoo;

public class TestandoWhile {
    public static void main(String[] args) {
        int recebe = 0;
        boolean teste = true;
        while(teste){
            int contador = 0;
            contador++;
            recebe += contador;
            System.out.println(recebe);
            if(contador <= 10) {
                teste = false;
            }
        }
        System.out.println(recebe);

    }
}

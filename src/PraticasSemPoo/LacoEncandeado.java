package PraticasSemPoo;

public class LacoEncandeado {
    public static void main(String[] args) {
        for (int multiplicador = 0; multiplicador <10; multiplicador++){
            for (int contador = 0; contador < 10; contador++){
                System.out.printf("%d x %d = %d\n",(multiplicador + 1), (contador + 1) ,(contador + 1)* (multiplicador + 1));
            }
        }
    }
}

package PraticasSemPoo;

public class TestandoEscopo {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 1;
        boolean acompanhado = false;

        if(quantidadePessoas >= 2){
              acompanhado = true;
            System.out.println(acompanhado);
        }
        else{
             acompanhado = false;
            System.out.println(acompanhado);

        }


        System.out.println("Valor acompanhado = "+acompanhado);

        if(idade >= 18 && acompanhado){
            System.out.println("Você pode entrar!");
        }
        else{
            System.out.println("Você não pode entrar!");

        }


    }
}


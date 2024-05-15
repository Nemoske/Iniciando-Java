package PraticasSemPoo;

public class TestandoCondicional2 {
    public static void main(String[] args) {
        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >=2;

        System.out.println(acompanhado);

                if(idade >= 18 && acompanhado){
                     System.out.println("Você pode entrar");
                }
                else{
                     System.out.println("Você não pode entrar, é menor de 18");
                 }
            }
        }

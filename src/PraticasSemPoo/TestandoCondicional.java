package PraticasSemPoo;

public class TestandoCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 15;
        int acompanhado = 3;
        if(idade >= 18){
            System.out.println("Você tem mais de 18 anos");
        }
        else if (acompanhado > 2){
            System.out.println("Você é menor de 18, porém pode entrar acompanhando");
        }
            else{
                System.out.println("Você não pode entrar, é menor de 18");

            }
        }
    }


import java.util.Scanner;

public class Contador {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int parametro1, parametro2;

        System.out.println("Digite o primeiro parâmetro: ");
        parametro1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        parametro2 = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar (parametro1, parametro2);

            } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }

    }
    static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser maior que o segundo parâmetro!!!");

        } int contagem = parametro1 - parametro2;
            for(int i = parametro1; i <= parametro2; i++) {
            System.out.println("Número: " + i);
        //realizar o for para imprimir os números com base na variável contagem

    }
 }
}

import exception.ParametrosInvalidosException;

import java.util.Scanner;

import static processor.Contador.contar;

public class ControleFluxo {
    public static void main(String[] args) throws ParametrosInvalidosException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        contar(parametroUm, parametroDois);

        sc.close();
    }
}

package processor;

import exception.ParametrosInvalidosException;

public class Contador {

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException, InterruptedException {

        if(parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for(int i=1; i<=contagem; i++){
            Thread.sleep(1000);
            System.out.printf("Imprimindo o número %d \n", i);
        }

    }

}

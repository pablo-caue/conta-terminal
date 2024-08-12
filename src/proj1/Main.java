package src.proj1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta");
        int numAgencia = sc.nextInt();
        System.out.println("Por favor, digite o numero da agencia");
        String numConta = sc.next();
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = sc.next();
        System.out.println("Por ultimo, digite o saldo da conta");
        float saldoConta = sc.nextFloat();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}

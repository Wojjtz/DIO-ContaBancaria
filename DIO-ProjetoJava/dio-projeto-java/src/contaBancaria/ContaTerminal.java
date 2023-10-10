package contaBancaria;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        String agencia, nomeCLiente;
        double saldo;

        System.out.println("Insira o número: ");
        numero = in.nextInt();
        System.out.println("Insira a agência: ");
        agencia = in.next();
        System.out.println("Insira o nome do cliente: ");
        nomeCLiente = in.next();
        System.out.println("Insira o saldo: ");
        saldo = in.nextDouble();

        in.close();

        System.out.println("Olá " + nomeCLiente + ", obrigado por criar uma conta em nosso banco."
        +" \nSua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está dísponivel para saque." );
    }   
}

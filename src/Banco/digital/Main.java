package Banco.digital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String cpf = "";
        boolean cpfValido = false;

        while (!cpfValido) {
            System.out.print("CPF: ");
            cpf = scanner.next();
            cpfValido = validarCpf (cpf);
            if (!cpfValido) {
                System.out.println("CPF inválido, digite novamente: ");
            }
        }
        System.out.print("Nome Completo: ");
        nome = scanner.next();

        Cliente cliente = new Cliente(nome, cpf);
        Boleto boleto1 = new Boleto("123",50);
        Boleto boleto2 = new Boleto("1234",300);


        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        cc.depositar(200);
        cc.transferir(100, poupanca);
        cc.pagamentoBoleto(boleto1);
        cc.pagamentoBoleto(boleto2);
        cc.recarga("7190000-0000", 20);
        cc.recarga("7190000-0000", 200);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

    private static boolean validarCpf (String cpf) {
        if (cpf != null && cpf.length() == 11) {
            return true;
        }
        return false;

    }

}


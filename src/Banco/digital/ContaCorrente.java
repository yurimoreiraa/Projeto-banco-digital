package Banco.digital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
    public void pagamentoBoleto(Boleto boleto) {
        if (possuiSaldo(boleto.getValorBoleto())) {
            sacar(boleto.getValorBoleto());
            boleto.setPago(true);
            System.out.println("Boleto pago com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void recarga (String numeroCelular, double valorRecarga) {
        if (possuiSaldo(valorRecarga)) {
            sacar(valorRecarga);
            System.out.println("Recaga realizada com sucesso para o número: " + numeroCelular);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private boolean possuiSaldo (double valor) {
        return getSaldo() >= valor;
    }

}
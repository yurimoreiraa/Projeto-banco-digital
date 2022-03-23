package Banco.digital;

public class Boleto {
    String codigoBarras;
    double valorBoleto;
    boolean pago;

    public Boleto(String codigoBarras, double valorBoleto) {
        this.codigoBarras = codigoBarras;
        this.valorBoleto = valorBoleto;
        this.pago = false;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getValorBoleto() {
        return valorBoleto;
    }

    public void setValorBoleto(double valorBoleto) {
        this.valorBoleto = valorBoleto;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}

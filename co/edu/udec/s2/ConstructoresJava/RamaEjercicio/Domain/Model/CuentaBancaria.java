package RamaEjercicio.Domain.Model;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = 23490123;
        this.saldo = 123000.0;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor parametrizado
    public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 123000.0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado
    public CuentaBancaria (int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    

    @Override
    public String toString() {
        return "Numero de cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo de cuenta: " + tipoCuenta;
    }
}

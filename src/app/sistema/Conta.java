package app.sistema;

public abstract class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }
    
    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Saldo: R$ %.2f\n", this.saldo);
    }
    
}

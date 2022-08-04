package app;


import app.contas.Corrente;
import app.contas.Poupanca;
import app.sistema.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Matheus");

        Corrente corrente = new Corrente(cliente);
        corrente.depositar(100.92);

        Poupanca poupanca = new Poupanca(cliente);

        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

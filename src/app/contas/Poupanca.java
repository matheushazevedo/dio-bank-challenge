package app.contas;

import app.sistema.Cliente;
import app.sistema.Conta;

public class Poupanca extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupaça");
        imprimirInfosComuns();
        
    }

}

package app.contas;

import app.sistema.Cliente;
import app.sistema.Conta;

public class Corrente extends Conta{

    

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        imprimirInfosComuns();

    }


}

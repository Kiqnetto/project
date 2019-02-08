/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibm;

import java.util.Date;

/**
 *
 * @author kvnet
 */
class Conta {
    private int numConta;
    private double saldo;
    private Cliente cliente;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean sacar (double valorSaque){
        if (valorSaque <= this.saldo){
            this.saldo -= valorSaque;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean depositar (double valorDeposito){
        this.saldo += valorDeposito;
        return true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}

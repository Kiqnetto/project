/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kvnet
 */
public class Ibm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("João da Silva");
        cliente1.setIdade(40);
        cliente1.setEndereco("Belo Horizonte");
        
        Conta conta1 = new Conta();
        conta1.setNumConta(001);
        conta1.setSaldo(1000);
        conta1.setCliente(cliente1);
        
        conta1.sacar(10000);
        
    }
    
}

package br.calebe.ticketmachine.test;

import br.calebe.ticketmachine.core.TicketMachine;

import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

public class TicketMachineTest {
    

    @Test
    public void inserirTest(){

        
        try {
            int valor = 4;
            TicketMachine obj = new TicketMachine(valor);
            obj.inserir(10);
            Assert.assertEquals(2, obj.getSaldo());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //System.out.println(obj.getSaldo());
        

    }

    public void getSaldoTest(){

    }

    public void getTrocoTest(){

    }

    public void imprimir(){
        
    }
}

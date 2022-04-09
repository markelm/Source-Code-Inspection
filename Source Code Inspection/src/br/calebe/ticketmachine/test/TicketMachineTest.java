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
            Assert.assertEquals(10, obj.getSaldo());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //System.out.println(obj.getSaldo());
        

    }

    @Test
    public void getSaldoTest(){

        try {
            int valor = 4;
            TicketMachine obj = new TicketMachine(valor);
            int[] arr = {2,4,5,10,50,100};
            for (int i = 0; i < arr.length; i++){
                obj.inserir(arr[i]);
            }
            Assert.assertEquals(171, obj.getSaldo());
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    @Test
    public void getTrocoTest(){
        try{
            int valor = 5;
            TicketMachine obj = new TicketMachine(valor);
            obj.inserir(10);
            Assert.assertEquals(5, obj.getTroco());
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }

    @Test
    public void imprimir(){

        try{
            int valor = 10;
            TicketMachine obj = new TicketMachine(valor);
            obj.inserir(10);
            System.out.println(obj.imprimir());
            String result = "*****************\n";
            result += "*** R$ 10,00 ****\n";
            result += "*****************\n";
            Assert.assertEquals(result, obj.imprimir());
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}

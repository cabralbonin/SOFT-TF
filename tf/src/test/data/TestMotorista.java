package test.data;

import static org.junit.jupiter.api.Assertions.*;

import main.data.Corrida;
import main.data.Motorista;
import org.junit.jupiter.api.Test;

public class TestMotorista {

    @Test
    void test(){
        Motorista m = new Motorista("1","99","553441352","Joao", 250,4.5);
        Corrida co = new Corrida("1", 4.2, "São Paulo", "Joinville",21.5, true);
        m.saldoPosCorrida(co.getValor());
        float saldo_pos = 271.5f;
        assertEquals(saldo_pos, m.getSaldo());
    }



}

package test.data;

import static org.junit.jupiter.api.Assertions.*;

import main.data.Cliente;
import main.data.Corrida;
import org.junit.jupiter.api.Test;

public class TestCliente {

    @Test
    void test(){
        Corrida co = new Corrida("3", 12.5, "Navegantes", "São Paulo", 25,false);
        Cliente c = new Cliente("423", "ademar", "fdf@gav.com", "32432", 50, 4);
        c.saldoPosCorrida(co.getValor());
        c.reembolsoPosCancelamento(co.getValor());
        assertEquals(50, c.getSaldo());
    }
}

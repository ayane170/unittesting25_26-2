package week_6.enum1.vraag4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactieTypeTest {
TransactieType s = TransactieType.STORTEN;
TransactieType o = TransactieType.OPNEMEN;
    @Test
    void testOpnemenMetVoldoendeSaldo_retourneertNieuwSaldo() {
        assertEquals(60,o.voerTransactieUit(100,40));
    }

    @Test
    void testOpnemenMetOnvoldoendeSaldo_retourneertNieuwSaldo() {
        assertEquals(0,o.voerTransactieUit(50,80));
    }

    @Test
    void testOpnemenMetGelijkSaldo_retourneertNieuwSaldo() {
        assertEquals(0,o.voerTransactieUit(50,50));
    }
    @Test
    void testStortenVoegtBedragToeAanSaldo() {
        assertEquals(150,s.voerTransactieUit(100,50));
    }
    @Test
    void testStortenVoegtNullBedragToeAanSaldo() {
        assertEquals(100,s.voerTransactieUit(100,0));
    }


}
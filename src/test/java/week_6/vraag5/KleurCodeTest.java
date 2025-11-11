package week_6.vraag5;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class KleurCodeTest {

    @Test
    void getHexCode_voorRood() {
        assertEquals("#FF0000", KleurCode.ROOD.getHexCode());
    }

    @Test
    void getRGBValue_voorRood() {
        assertEquals("R:255, G:0, B:0", KleurCode.ROOD.getRGBValue());
    }

    @Test
    void fromHexCode_vindtRood() {
        Optional<KleurCode> result = KleurCode.fromHexCode("#FF0000");
        assertTrue(result.isPresent());
        assertEquals(KleurCode.ROOD, result.get());
    }

    @Test
    void fromHexCode_onbekendGeeftEmpty() {
        Optional<KleurCode> result = KleurCode.fromHexCode("#123456");
        assertTrue(result.isEmpty());
    }
}

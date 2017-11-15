import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class ElfTest {
    @Test
    public void ElfTest() {
        Elf elf1 = new Elf();
        Elf elf2 = new Elf();
        assertTrue(elf1.isAlive());
        assertEquals("class Elf (hp=10, power=10)", elf1.toString());
        GameManager gm = new GameManager();
        elf1.kick(elf2);
        gm.fight(elf1, elf2);
    }


}
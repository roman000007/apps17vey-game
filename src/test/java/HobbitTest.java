import org.junit.Test;
public class HobbitTest {
    @Test
    public void ElfTest() {
        Hobbit hb1 = new Hobbit();
        Hobbit hb2 = new Hobbit();
        GameManager gm = new GameManager();
        gm.fight(hb1, hb2);
    }

}
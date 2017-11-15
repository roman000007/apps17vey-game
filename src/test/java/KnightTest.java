import org.junit.Test;
public class KnightTest {
    @Test
    public void KnightTest() {
        Knight kg1 = new Knight();
        Knight kg2 = new Knight();
        GameManager gm = new GameManager();
        gm.fight(kg1, kg2);
    }

}
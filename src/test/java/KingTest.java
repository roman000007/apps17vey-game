import org.junit.Test;
public class KingTest {
    @Test
    public void KingTest() {
        King kg1 = new King();
        King kg2 = new King(12, 12, 12, 12);
        GameManager gm = new GameManager();
        gm.fight(kg1, kg2);
    }

}
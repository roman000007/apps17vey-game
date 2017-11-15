public class GameManager {
    private final static int MAX_TURNS_TO_DRAW = 100;
    void fight(Character c1, Character c2){
        System.out.println("Introduce our fighters!");
        System.out.println("Player 1: " + c1);
        System.out.println("Player 2: " + c2);
        System.out.println("START FIGHT!");
        int turn = 1;
        while (c1.isAlive() && c2.isAlive()){
            if(turn % 2 == 1){
                System.out.println("Player 1 turn! (Turn " + turn + ")");
                c1.kick(c2);
            } else{
                System.out.println("Player 2 turn! (Turn " + turn + ")");
                c2.kick(c1);
            }
            System.out.println("Player 1: " + c1);
            System.out.println("Player 2: " + c2);
            System.out.println("----------------------------------------");
            turn++;
            if(turn > GameManager.MAX_TURNS_TO_DRAW){
                System.out.println("Draw!");
                return;
            }
        }
        if (c1.isAlive()) {
            System.out.println("Player 1 win!!!");
        } else {
            System.out.println("Player 2 win!!!");
        }

    }
}

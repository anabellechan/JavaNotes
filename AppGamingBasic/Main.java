package AppGamingBasic;
import AppGamingBasic.GameRunner;
import AppGamingBasic.MarioGame;
import AppGamingBasic.SuperContraGame;

//This prog represents tight coupling
public class Main {
    public static void main(String[] args) {
        // var game= new SuperContraGame();
        var game= new PacmanGame();
        var gameRunner= new GameRunner(game);
        gameRunner.run();
    }
}

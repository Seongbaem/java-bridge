package bridge;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            PlayTheGame playGame = new PlayTheGame();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

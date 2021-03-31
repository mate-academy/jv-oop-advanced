package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public void generateColor(Figure figure) {
        Random rand = new Random();
        switch(rand.nextInt(3)) {
            case 0:
                figure.setColor(State.RED);
                break;
            case 1:
                figure.setColor(State.BLACK);
                break;
            case 2:
                figure.setColor(State.BLUE);
                break;
            case 3:
                figure.setColor(State.GREEN);
                break;
            default:
                break;
        }
    }
}

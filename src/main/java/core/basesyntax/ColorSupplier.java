package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public void generateColor(Figure figure) {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0:
                figure.setColor(Color.RED);
                break;
            case 1:
                figure.setColor(Color.BLACK);
                break;
            case 2:
                figure.setColor(Color.BLUE);
                break;
            case 3:
                figure.setColor(Color.GREEN);
                break;
            default:
                break;
        }
    }
}

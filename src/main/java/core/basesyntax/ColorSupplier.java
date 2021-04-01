package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int numberOfColors = 4;

    public void generateColor(Figure figure) {
        Random random = new Random();
        switch (random.nextInt(numberOfColors)) {
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

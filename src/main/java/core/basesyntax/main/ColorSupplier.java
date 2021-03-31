package core.basesyntax.main;

import java.util.Random;

public class ColorSupplier {

    public Colors generateColor() {
        Random random = new Random();
        int number = random.nextInt(Colors.values().length) + 1;

        switch (number) {
            case 1:
                return Colors.RED;
            case 2:
                return Colors.ORANGE;
            case 3:
                return Colors.YELLOW;
            case 4:
                return Colors.GREEN;
            case 5:
                return Colors.BLUE;
            case 6:
                return Colors.PINK;
            case 7:
                return Colors.WHITE;
            case 8:
                return Colors.BLACK;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }
}

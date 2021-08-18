package core.basesyntax.random;

import java.util.Random;

public class ColorSupplier {
    private static final int AMOUNT_OF_COLORS = Colors.values().length - 1;
    private Random randomColorNumber = new Random();

    public String getRandomColor() {
        String colorName;
        switch (randomColorNumber.nextInt(AMOUNT_OF_COLORS)) {
            case 0:
                colorName = "red";
                break;
            case 1:
                colorName = "yellow";
                break;
            case 2:
                colorName = "blue";
                break;
            case 3:
                colorName = "orange";
                break;
            case 4:
                colorName = "green";
                break;
            case 5:
                colorName = "violet";
                break;
            default:
                throw new IllegalStateException("Unexpected value: "
                        + randomColorNumber.nextInt(AMOUNT_OF_COLORS));
        }
        return colorName;
    }
}

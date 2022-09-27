package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 4;
    private Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);

        switch (colorNumber) {
            case 1:
                return "red";
            case 2:
                return "white";
            case 3:
                return "green";
            default:
                return "black";
        }
    }
}

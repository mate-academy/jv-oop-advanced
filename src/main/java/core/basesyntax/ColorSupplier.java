package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 5;
    private Random random = new Random();
    private String color;

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);
        switch (colorNumber) {
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "blue";
            case 4:
                return "white";
            default:
                return "black";
        }
    }
}
